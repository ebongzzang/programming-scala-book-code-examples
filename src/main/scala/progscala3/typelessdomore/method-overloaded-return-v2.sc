// src/main/scala/progscala3/typelessdomore/method-overloaded-return-v2.sc
// Version 2 of "StringUtil" (with a fixed compilation error).

object StringUtilV2 {
  def joiner(string: String, strings: String*): String = 
    joiner(string +: strings)

  def joiner(strings: Seq[String]): String = strings.mkString("-")
}

assert(StringUtilV2.joiner("Programming", "Scala") ==
  "Programming-Scala")
assert(StringUtilV2.joiner(Seq("Programming", "Scala")) ==
  "Programming-Scala")

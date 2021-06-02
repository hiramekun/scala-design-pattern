package adapter.sample1

trait Banner {
  val str: String

  def showWithParen(): Unit = println(s"($str)")

  def showWithAster(): Unit = println(s"*$str*")
}

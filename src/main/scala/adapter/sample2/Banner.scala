package adapter.sample2

class Banner(val str:String) {

  def showWithParen(): Unit = println(s"($str)")

  def showWithAster(): Unit = println(s"*$str*")
}

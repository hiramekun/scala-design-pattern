package factoryMethod.idcard

import factoryMethod.framework._

class IDCard(val owner: String) extends Product {
  override def use(): Unit = println(s"${owner}のカードを使います。")
}

object IDCard {
  def apply(owner: String): IDCard = {
    println(s"${owner}のカードを作ります。")
    new IDCard(owner)
  }
}

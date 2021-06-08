package factoryMethod

import factoryMethod.framework.Factory
import factoryMethod.idcard.IDCardFactory
import factoryMethod.framework.Product

object FactoryMethodMain {
  def main(args: Array[String]): Unit = {
    val factory: Factory = new IDCardFactory()
    val card1: Product = factory.create("a")
    val card2 = factory.create("b")
    val card3 = factory.create("c")
    card1.use()
    card2.use()
    card3.use()
  }
}

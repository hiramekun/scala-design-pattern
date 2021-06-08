package factoryMethod.idcard

import factoryMethod.framework.Factory

class IDCardFactory extends Factory {
  var owners = Seq.empty[String]

  override type ConcreteProduct = IDCard

  override def createProduct(owner: String): IDCard = IDCard(owner)

  override def registerProduct(product: IDCard): Unit =
    owners :+= product.owner
}

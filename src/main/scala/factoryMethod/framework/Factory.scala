package factoryMethod.framework

abstract class Factory {
  type ConcreteProduct <: Product

  final def create(owner: String): Product = {
    val p = createProduct(owner)
    registerProduct(p)
    p
  }

  protected def createProduct(owner: String): ConcreteProduct

  protected def registerProduct(product: ConcreteProduct): Unit
}

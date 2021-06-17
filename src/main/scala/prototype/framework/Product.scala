package prototype.framework

trait Product extends Cloneable {
  def use(s: String): Unit

  def createClone: Product
}

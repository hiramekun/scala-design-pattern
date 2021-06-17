package prototype.framework

class Manager {
  private var showcase = Map[String, Product]()

  def register(name: String, proto: Product): Unit = showcase += (name -> proto)

  def create(protoname: String): Option[Product] = showcase.get(protoname).map(_.createClone)
}

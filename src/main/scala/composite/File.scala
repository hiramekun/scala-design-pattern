package composite

case class File(override val name: String, size: Int) extends Entry {
  override def printList(prefix: String): Unit = println(prefix + "/" + this)
}

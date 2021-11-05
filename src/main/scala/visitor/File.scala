package visitor

case class File(name: String, size: Int) extends Entry {
  override def accept(v: Visitor): Unit = v.visit(this)
}

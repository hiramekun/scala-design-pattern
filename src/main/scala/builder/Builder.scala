package builder

trait Builder {
  val title: String

  def makeTitle(): Unit

  def makeString(str: String): Unit

  def makeItems(items: Seq[String]): Unit

  def close(): Unit
}

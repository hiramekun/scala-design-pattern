package builder

class TextBuilder(override val title: String) extends Builder {
  private val buffer = new StringBuffer()

  override def makeTitle(): Unit = {
    buffer.append("=======================\n")
    buffer.append(s"『$title』\n")
    buffer.append("\n")
  }

  override def makeString(str: String): Unit = {
    buffer.append(s"■$str\n")
    buffer.append("\n")
  }

  override def makeItems(items: Seq[String]): Unit = {
    items.foreach(item => buffer.append(s"　・$item\n"))
    buffer.append("\n")
  }

  override def close(): Unit = buffer.append("=======================\n")

  def getResult: String = buffer.toString
}

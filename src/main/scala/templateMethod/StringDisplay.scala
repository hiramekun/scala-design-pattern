package templateMethod

case class StringDisplay(string: String) extends AbstractDisplay {
  private val width = string.getBytes().length

  override def open(): Unit = printLine()

  override def myPrint(): Unit = println("|" + string + "|")

  override def close(): Unit = printLine()

  private def printLine(): Unit = {
    print("+")
    (0 to width).foreach(_ => print("-"))
    println("+")
  }
}

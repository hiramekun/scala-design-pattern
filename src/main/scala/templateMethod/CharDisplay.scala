package templateMethod

case class CharDisplay(char: Char)extends AbstractDisplay{
  override def open(): Unit = print("<<")

  override def myPrint(): Unit = print(char)

  override def close(): Unit = println(">>")
}

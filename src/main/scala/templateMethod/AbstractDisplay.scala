package templateMethod

trait AbstractDisplay {
  def open(): Unit

  def myPrint(): Unit

  def close(): Unit

  final def display(): Unit = {
    open()
    (0 until 5).foreach(_ => myPrint())
    close()
  }
}

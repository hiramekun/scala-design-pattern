package adapter.sample1

case class PrintBanner(override val str: String) extends Banner with Print {
  override def printWeak(): Unit = showWithParen()

  override def printStrong(): Unit = showWithAster()
}

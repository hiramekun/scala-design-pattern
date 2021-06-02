package adapter.sample2

case class PrintBanner(value: String) extends Print {
  private val banner = new Banner(value)

  override def printWeak(): Unit = banner.showWithParen()

  override def printStrong(): Unit = banner.showWithAster()
}

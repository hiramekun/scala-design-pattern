package adapter.sample1

object PrintBannerMain {
  def main(args: Array[String]): Unit = {
    val p = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()
  }
}

package templateMethod

object TemplateMethodMain {
  def main(args: Array[String]): Unit = {
    val d1 = CharDisplay('H')
    val d2 = StringDisplay("Hello, world.")
    val d3 = StringDisplay("こんにちは。")
    d1.display()
    d2.display()
    d3.display()
  }
}

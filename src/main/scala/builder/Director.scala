package builder

class Director[T <: Builder](generate: String => T) {
  val builder: T = generate("Greeting")
  def construct(): Unit = {
    builder.makeTitle()
    builder.makeString("朝から昼にかけて")
    builder.makeItems(Seq("おはようございます", "こんにちは"))
    builder.makeString("夜に")
    builder.makeItems(Seq("こんばんは", "おやすみなさい", "さようなら"))
    builder.close()
  }
}

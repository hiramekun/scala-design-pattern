package builder

object BuilderMain {
  def main(args: Array[String]): Unit = {
    val textBuilder = new TextBuilder(_)
    val director = new Director(textBuilder)
    director.construct()
    println(director.builder.getResult)

    val htmlBuilder = new HtmlBuilder(_)
    val director2 = new Director(htmlBuilder)
    director2.construct()
    println(director2.builder.getResult)
  }
}

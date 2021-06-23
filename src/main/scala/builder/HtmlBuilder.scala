package builder

import java.io.{FileWriter, PrintWriter}

class HtmlBuilder(override val title: String) extends Builder {
  private val fileName = s"$title.html"
  private val writer: PrintWriter = {
    new PrintWriter(new FileWriter(fileName))
  }

  override def makeTitle(): Unit = {
    writer.println(s"<html><head><title>$title</title></head><body>")
    writer.println(s"<h1>$title</h1>")
  }

  override def makeString(str: String): Unit = writer.println(s"<p>$str</p>")

  override def makeItems(items: Seq[String]): Unit = {
    writer.println("<ul>")
    items.foreach(item => writer.println(s"<li>$item</li>"))
    writer.println("</ul>")
  }

  override def close(): Unit = {
    writer.println("</body></html>")
    writer.close()
  }

  def getResult: String = fileName
}

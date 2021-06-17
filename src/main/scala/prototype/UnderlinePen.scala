package prototype
import framework.Product

class UnderlinePen(ulchar: Char) extends Product{
  override def use(s: String): Unit = {
    println(s""""$s"""")
    print(" ")
    val len = s.getBytes().length
    (0 until len).foreach(_ => print(ulchar))
    println()
  }

  override def createClone: Product =  clone().asInstanceOf[Product]
}

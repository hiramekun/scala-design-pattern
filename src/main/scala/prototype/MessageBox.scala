package prototype

import framework.Product

class MessageBox(decochar: Char) extends Product {
  override def use(s: String): Unit = {
    val len = s.getBytes().length
    (0 until len + 4).foreach(_ => print(decochar))
    println()
    println(s"""$decochar $s $decochar""")
    (0 until len + 4).foreach(_ => print(decochar))
    println()
  }

  override def createClone: Product = clone().asInstanceOf[Product]
}

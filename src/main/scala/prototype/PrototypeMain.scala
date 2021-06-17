package prototype

import prototype.framework.Manager

object PrototypeMain {
  def main(args: Array[String]): Unit = {
    val manager = new Manager()
    val upen = new UnderlinePen('~')
    val mbox = new MessageBox('*')
    val sbox= new MessageBox('/')
    manager.register("strong message", upen)
    manager.register("warning box", mbox)
    manager.register("slash box", sbox)

    val p1 = manager.create("strong message")
    p1.foreach(_.use("Hello, world"))
    val p2 = manager.create("warning box")
    p2.foreach(_.use("Hello, world"))
    val p3 = manager.create("slash box")
    p3.foreach(_.use("Hello, world"))
  }
}

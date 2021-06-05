package composite

object CompositeMain {
  // TODO: refactor
  def main(args: Array[String]): Unit = {
    println("Making root entries...")
    val rootDir = Directory("root")
    val binDir = Directory("bin")
    val tmpDir = Directory("tmp")
    val usrDir = Directory("usr")

    for {
      _ <- binDir.add(File("vi", 10000))
      _ <- binDir.add(File("latex", 20000))
      _ <- rootDir.add(binDir)
      _ <- rootDir.add(tmpDir)
      _ <- rootDir.add(usrDir)
    } yield {
      rootDir.printList()
    }

    println("Making user entries...")
    val yuki = Directory("yuki")
    val hanako = Directory("hanako")
    val tomura = Directory("tomura")
    for {
      _ <- usrDir.add(yuki)
      _ <- usrDir.add(hanako)
      _ <- usrDir.add(tomura)
      _ <- yuki.add(File("diary.html", 100))
      _ <- yuki.add(File("Composite.java", 200))
      _ <- hanako.add(File("memo.txt", 300))
      _ <- tomura.add(File("game.doc", 400))
      _ <- tomura.add(File("junk.all", 500))
    } yield {
      rootDir.printList()
    }
  }
}

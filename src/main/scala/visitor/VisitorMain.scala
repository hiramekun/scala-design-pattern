package visitor

object VisitorMain {
  def main(args: Array[String]): Unit = {
    println("Making root entries...")
    val rootDir = Directory("root")
    val binDir = Directory("bin")
    val tmpDir = Directory("tmp")
    val usrDir = Directory("usr")
    rootDir.add(binDir)
    rootDir.add(tmpDir)
    rootDir.add(usrDir)
    binDir.add(File("vi", 10000))
    binDir.add(File("latex", 20000))
    rootDir.accept(new ListVisitor)

    System.out.println("")
    System.out.println("Making user entries...")
    val yuki = Directory("yuki")
    val hanako = Directory("hanako")
    val tomura = Directory("tomura")
    usrDir.add(yuki)
    usrDir.add(hanako)
    usrDir.add(tomura)
    yuki.add(File("diary.html", 100))
    yuki.add(File("Composite.java", 200))
    hanako.add(File("memo.tex", 300))
    tomura.add(File("game.doc", 400))
    tomura.add(File("junk.mail", 500))
    rootDir.accept(new ListVisitor)
  }
}

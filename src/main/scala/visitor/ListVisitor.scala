package visitor

class ListVisitor extends Visitor {
  private var currentDir = ""

  override def visit(file: File): Unit = println(s"$currentDir/$file")

  override def visit(directory: Directory): Unit = {
    println(s"$currentDir/$directory")
    val saveDir = currentDir
    currentDir = s"$currentDir/${directory.name}"
    directory.iterator.foreach(_.accept(this))
    currentDir = saveDir
  }
}

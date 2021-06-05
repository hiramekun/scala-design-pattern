package composite

case class Directory(override val name: String) extends Entry {
  private var directory = Seq.empty[Entry]

  override def size: Int = directory.foldLeft(0)(_ + _.size)

  override def add(entry: Entry): Either[FileTreatmentError, Entry] = {
    directory :+= entry
    Right(this)
  }

  override def toString: String = super.toString

  override def printList(prefix: String): Unit = {
    println(prefix + "/" + this)
    directory.foreach(_.printList(prefix + "/" + name))
  }
}

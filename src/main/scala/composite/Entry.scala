package composite

trait Entry {
  val name: String

  def size: Int

  def add(entry: Entry): Either[FileTreatmentError, Entry] = Left(FileTreatmentError())

  def printList(): Unit = printList("")

  def printList(prefix: String)

  override def toString: String = name + " (" + size + ")"
}

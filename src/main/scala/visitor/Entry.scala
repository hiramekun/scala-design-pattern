package visitor

trait Entry extends Element {
  val name: String

  def size: Int

  def add(entry: Entry): Entry = {
    throw new FileTreatmentException()
  }

  def iterator: Iterator[Entry] = {
    throw new FileTreatmentException()
  }

  override def toString: String = s"$name {$size}"
}

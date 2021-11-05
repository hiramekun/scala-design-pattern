package visitor

import scala.collection.mutable

case class Directory(name: String) extends Entry {
  private val dir = mutable.ListBuffer.empty[Entry]

  override def size: Int = {
    dir.foldLeft[Int](0)((result, entry) => result + entry.size)
  }

  override def accept(v: Visitor): Unit = v.visit(this)

  override def add(entry: Entry): Entry = {
    dir += entry
    this
  }

  override def iterator: Iterator[Entry] = dir.iterator
}

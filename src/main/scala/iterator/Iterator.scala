package iterator

trait Iterator[A] {
  def hasNext: Boolean

  def next(): A
}

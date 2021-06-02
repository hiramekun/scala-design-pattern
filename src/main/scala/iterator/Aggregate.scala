package iterator

trait Aggregate[A] {
  def iterator: Iterator[A]
}

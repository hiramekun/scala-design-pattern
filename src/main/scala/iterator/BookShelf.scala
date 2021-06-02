package iterator

class BookShelf(private var books: Seq[Book]) extends Aggregate[Book] {
  private var last = 0

  override def iterator: Iterator[Book] = BookShelfIterator(this)

  def getBookAt(index: Int): Book = books(index)

  def appendBook(book: Book): Unit = {
    books :+= book
    last += 1
  }

  def length: Int = last
}

object BookShelf {
  def apply(): BookShelf = new BookShelf(Seq.empty)
}
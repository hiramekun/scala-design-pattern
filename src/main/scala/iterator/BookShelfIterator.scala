package iterator

case class BookShelfIterator(bookShelf: BookShelf) extends Iterator[Book] {
  private var index: Int = 0

  override def hasNext: Boolean = index < bookShelf.length

  override def next(): Book = {
    val book = bookShelf.getBookAt(index)
    index += 1
    book
  }
}

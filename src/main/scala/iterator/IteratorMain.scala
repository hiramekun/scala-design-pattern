package iterator

object IteratorMain {
  def main(args: Array[String]): Unit = {
    val bookShelf = BookShelf()
    bookShelf.appendBook(Book("Around the world in 80 days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-long-legs"))

    val iterator = bookShelf.iterator
    while (iterator.hasNext) {
      val book = iterator.next()
      println(book.name)
    }
  }
}

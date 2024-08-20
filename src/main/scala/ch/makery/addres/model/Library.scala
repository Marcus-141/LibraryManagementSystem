package ch.makery.address

class Library{
  var books: List[Book] = List()
  Var users: List{User} = List()

  def addBook(book: Book): Unit = {books = book :: books}
  def removeBook(book: Book): Unit = { books =  books.filterNot(_== book)}
  def findBook(query: String): List[Book] = {
    books.filter(book => book.title.contains(query)|| book.author.contains())
  }
}
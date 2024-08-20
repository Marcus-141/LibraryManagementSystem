package ch.makery.address

class User(val userId: String, val name: String){
  var borrowedBooks: List[Book] = List()

  def borrowBook(book: Book): Unit = {
    if (book.availableCopies > 0) {
      book.checkOut()
      borrowedBooks = book :: borrowedBooks
    }
  }

  def returnBook(book: Book): Unit = {
    book.checkIn()
    borrowedBooks = borrowedBooks.filterNot(_== book)
  }
}
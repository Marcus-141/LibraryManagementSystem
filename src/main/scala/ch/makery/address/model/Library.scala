/*
package ch.makery.address.model

class Library{
  var books: List[Book] = List()
  var userID: List[User] = List()


  def addBook(book: Book): Unit = {books = book :: books}
  def removeBook(book: Book): Unit = { books =  books.filterNot(_== book)}
  def findBook(query: String): List[Book] = {
    books.filter(book => book.title.contains(query)|| book.author.contains(query))
  }
  def viewBookDetails(book: Book): String = {
    s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.ISBN}, Available Copies: ${book.availableCopy}"
  }
}
*/

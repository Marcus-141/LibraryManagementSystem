package ch.makery.address.view
import ch.makery.address.MainApp
import ch.makery.address.model.Book
import scalafx.event.ActionEvent
import scalafx.scene.control.{TableColumn, TableView}
import scalafxml.core.macros.sfxml

@sfxml
class BooksOverview(
                     private val bookTable: TableView[Book],
                     private val dueTable: TableView[Book],
                     private val titleColumn: TableColumn[Book, String],
                     private val authorColumn: TableColumn[Book, String],
                     private val ISBNColumn: TableColumn[Book, String]
                   ){

  bookTable.items = MainApp.bookData
  dueTable.items = MainApp.dueBooks

  titleColumn.cellValueFactory = {_.value.title}
  authorColumn.cellValueFactory = {_.value.author}
  ISBNColumn.cellValueFactory = {_.value.ISBN}

  def logOutBtn(event: ActionEvent): Unit = {
    MainApp.logOut()
  }
  def dueBooksBtn(event: ActionEvent): Unit = {
    MainApp.showDueBooks()
  }
  def borrowBooksBtn(event: ActionEvent): Unit = {
    MainApp.showBorrowedBooks()
  }
  def dashBoard(event: ActionEvent): Unit = {
    MainApp.showUserPage()
  }

}
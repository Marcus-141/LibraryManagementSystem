package ch.makery.address.view
import ch.makery.address.MainApp
import ch.makery.address.model.Book
import scalafx.event.ActionEvent
import scalafx.scene.control.{TableColumn, TableView}
import scalafxml.core.macros.sfxml
import java.time.LocalDate

@sfxml
class BorrowedOverview(
                     private val bookTable: TableView[Book],
                     private val titleColumn: TableColumn[Book, String],
                     private val authorColumn: TableColumn[Book, String],
                     private val ISBNColumn: TableColumn[Book, String],
                     private val DateColumn: TableColumn [Book, LocalDate]
                      ){

  bookTable.items = MainApp.bookData

  titleColumn.cellValueFactory = {_.value.title}
  authorColumn.cellValueFactory = {_.value.author}
  ISBNColumn.cellValueFactory = {_.value.ISBN}
  DateColumn.cellValueFactory = {_.value.BorrowDate}

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
    MainApp.showDashBoard()
  }

}
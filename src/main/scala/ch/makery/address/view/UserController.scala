package ch.makery.address.view
import ch.makery.address.MainApp
import scalafx.event.ActionEvent
import scalafxml.core.macros.sfxml

@sfxml
class UserController {
  def dashLogOutBtn(event: ActionEvent): Unit = {
    MainApp.logOut()
  }

  def  dashDueBtn(event: ActionEvent): Unit = {
    MainApp.showDueBooks()
  }

  def  dashBorrowBtn(event: ActionEvent): Unit = {
    MainApp.showBorrowedBooks()
  }
}
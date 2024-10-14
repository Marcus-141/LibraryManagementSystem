package ch.makery.address
import ch.makery.address.model._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.layout.AnchorPane
import scalafx.Includes._
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import javafx.{scene => jfxs}
import scalafx.collections.ObservableBuffer
import java.time.LocalDate

object MainApp extends JFXApp {
  val bookData = new ObservableBuffer[Book]()
  val dueBooks = new ObservableBuffer[Book]()

  // Initialize book data
  bookData ++= Seq(
    new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "978-0132350884", LocalDate.of(2024, 7, 24)),
    new Book("Scala Programming Projects", "Mikael Valot", "978-1788397644", LocalDate.of(2024, 7, 26)),
    new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides", "978-0201633610", LocalDate.of(2024, 7, 28)),
    new Book("Programming in Scala", "Martin Odersky, Lex Spoon, and Bill Venners", "978-0981531649", LocalDate.of(2024, 7, 30)),
    new Book("Operating Systems: Three Easy Pieces", "Remzi H. Arpaci-Dusseau and Andrea C. Arpaci-Dusseau", "978-1985086593", LocalDate.of(2024, 8, 2))
  )

  // Initialize due books
  dueBooks ++= Seq(
    new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", "978-0135957059", LocalDate.of(2024, 8, 10)),
    new Book("Effective Java", "Joshua Bloch", "978-0134685991", LocalDate.of(2024, 8, 12)),
    new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", "978-0201485677", LocalDate.of(2024, 8, 14)),
    new Book("Head First Design Patterns", "Eric Freeman and Elisabeth Robson", "978-0596007126", LocalDate.of(2024, 8, 16)),
    new Book("Introduction to Algorithms", "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein", "978-0262533058", LocalDate.of(2024, 8, 18))
  )

  // Initialize the primary stage
  stage = new PrimaryStage {
    title = "LibraryManagementSystem"
    scene = new Scene {
      root = loadFXML("view/Login.fxml")
    }
  }
  stage.setResizable(false)

  def showBorrowedBooks(): Unit = {
    stage.scene().root = loadFXML("view/BooksBorrowed.fxml")
    stage.centerOnScreen()
    stage.title = "Books Borrowed"
    stage.setResizable(false)
  }
  def showDueBooks(): Unit = {
    stage.scene().root = loadFXML("view/BooksDue.fxml")
    stage.centerOnScreen()
    stage.title = "Books Due"
    stage.setResizable(false)
  }

  def showUserPage(): Unit = {
    stage.scene().root = loadFXML("view/User.fxml")
    stage.centerOnScreen()
    stage.title = "User Page"
    stage.setResizable(false)
  }

  def logOut(): Unit ={
    stage.scene().root = loadFXML("view/Login.fxml")
    stage.centerOnScreen()
    stage.title = "LogIn Page"
    stage.setResizable(false)
  }

  private def loadFXML(resource: String): AnchorPane = {
    val resourceUrl = getClass.getResource(resource)
    if (resourceUrl == null) {
      throw new IllegalStateException(s"FXML file not found: $resource")
    }
    val loader = new FXMLLoader(resourceUrl, NoDependencyResolver)
    loader.load()
    loader.getRoot[jfxs.layout.AnchorPane]
  }

}
package ch.makery.address.view
import ch.makery.address.MainApp
import scalafx.event.ActionEvent
import scalafx.scene.{Parent, Scene}
import scalafx.scene.control.{PasswordField, TextField}
import scalafx.stage.Stage
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import scalafxml.core.macros.sfxml

import scalafx.scene.input.MouseEvent

@sfxml
class LoginController (
                       private val user_txt: TextField,
                       var pass_text: PasswordField
                      ){
  private val password1: String = "sup3rStR0ngp4ssW0rD"
  private val userID1: String = "User"

  user_txt.text = userID1
  pass_text.text = password1

  def loginBtnOnClick(event: ActionEvent): Unit = {
    MainApp.showDashBoard()
    /*val userID = user_txt.getText
    val password = pass_text.getText
    println(s"user_txt: $user_txt, pass_text: $pass_text")

    try {
      if ((userID == userID1).&&(password == password1)) {
        println("Successful login")
        val stage = user_txt.getScene.getWindow.asInstanceOf[Stage]
        val resource = getClass.getResource("view/DashBoard.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val root = loader.getRoot[Parent]
        stage.setScene(new Scene(root))
        stage.centerOnScreen()
        stage.setTitle("User Page")
      } else {
        println("Wrong username or password")
      }
    }

     */
  }
}

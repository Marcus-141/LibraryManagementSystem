package ch.makery.address.view

import ch.makery.address.MainApp
import scalafx.event.ActionEvent
import scalafx.scene.{Scene, Parent}
import scalafx.scene.control.{PasswordField, TextField}
import scalafx.stage.Stage
import scalafxml.core.{FXMLLoader, NoDependencyResolver}
import scalafxml.core.macros.sfxml

@sfxml
class LoginController(private val password1: "sup3rStR0ngp4ssW0rD",
                      private val userID1: "User"){
  @sfxml
  private var user_txt: TextField =_
  @sfxml
  private var pass_text: PasswordField=_

  @sfxml
  def login_btn_onClick(event: ActionEvent): Unit = {
    val userID = user_txt.text()
    val password = pass_text.text()
    println(s"$username$password")

    try {
      if (username == username1 && password == password1) {
        println("Successful login")
        val stage = user_txt.getScene.getWindow.asInstanceOf[Stage]
        val resource = getClass.getResource("Login.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val root = loader.getRoot[Parent]
        stage.setScene(new Scene(root))
        stage.centerOnScreen()
        stage.setTitle("Sapply - Administrator")
      } else {
        println("Wrong username or password")
      }
    }
  }
}
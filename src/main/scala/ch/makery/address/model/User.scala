package ch.makery.address.model
import scalafx.beans.property.{ObjectProperty, StringProperty}
import java.time.LocalDate

class User(firstNameS: String, lastNameS: String, userIdS: String, postalCodeS:ObjectProperty[Int], streetNameS: String, CityS:String, birthDate:LocalDate){
  var FirstName = new StringProperty(firstNameS)
  var LastName = new StringProperty(lastNameS)
  var UserID = new StringProperty(userIdS)
  var PostalCode = ObjectProperty[Int](postalCodeS.value)
  var StreetName = new StringProperty(streetNameS)
  var City = new StringProperty(CityS)
  var BirthDate = ObjectProperty[LocalDate](LocalDate.of(birthDate.getYear, birthDate.getMonth, birthDate.getDayOfMonth))
}

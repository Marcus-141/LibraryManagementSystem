package ch.makery.address.model
import scalafx.beans.property.{StringProperty, ObjectProperty}
import java.time.LocalDate

class Book(titleS: String,authorS: String,ISBNs: String, borrowDate: LocalDate)  {

  var title = new StringProperty(this, "title",titleS)
  var author = new StringProperty(this, "author",authorS)
  var ISBN = new StringProperty(this, "ISBN",ISBNs)
  var BorrowDate = ObjectProperty[LocalDate](LocalDate.of(borrowDate.getYear, borrowDate.getMonth, borrowDate.getDayOfMonth))

}

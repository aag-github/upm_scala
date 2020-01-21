package views.CombinationViewReaders
import views.CombinationViewReader
import models.Combination
import views.io.GestorIO

object ConsoleCombinationViewReader extends CombinationViewReader{
  private def validateString(requestString:() => String, message :String = "") : String = {
    if (message != "") GestorIO.writeln(message)
    requestString() match {
      case a if a.toString.length != Combination.LENGTH => validateString(requestString, "Wrong length!")
      case a if !a.toList.map(Combination.COLORS_LIST.contains(_)).fold(true)(_&&_) => validateString(requestString, "Wrong characters!")
      case a => a
    }
  }
  override def read() : String =
    validateString(() => GestorIO.readString(s"Enter a sequence of ${Combination.LENGTH} colors.\nValid characters: ${Combination.COLORS_STRING}\n"))
}

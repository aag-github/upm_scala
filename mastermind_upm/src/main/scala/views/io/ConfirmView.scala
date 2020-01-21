package views.io

object ConfirmView {
def confirm(s: String) : Boolean = {
  GestorIO.readString(s"$s (y/n)") match {
    case "Y" | "y" => true
    case "N" | "n" => false
    case x => confirm(s"'$x' is not a valid option.\n$s")
  }

}
}

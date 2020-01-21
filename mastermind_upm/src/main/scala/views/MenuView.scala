package views

import views.io.GestorIO

abstract class MenuView() {
  val actionMap_ : Map[Int, (String, () => Boolean)]

  def run(option: Int): Boolean = {
    actionMap_.get(option) match {
      case Some(f) => f._2()
      case None =>
        println("Sorry, that command is not recognized")
        true
    }
  }

  def run() : Unit = {
    def loop(): Boolean = {
      actionMap_.map(x => GestorIO.writeln(s"  ${x._1} - ${x._2._1}"))
      run(GestorIO.readInt("Pick an option")) match {
        case true => loop()
        case _ => false
      }
    }
    loop()
  }
}

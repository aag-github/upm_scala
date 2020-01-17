package views

object GestorIO {

  def readString(title:String):String = {
    print(s"$title: ")
    scala.io.StdIn.readLine()
  }

  def writeln(string:String):Unit =
    println(string)

  def writeln(value:Int):Unit =
    println(value)

  def write(string:String):Unit =
    print(string)

  def write(value:Int):Unit =
    print(value)
}

package views.io

object GestorIO {

  def readString(title:String):String = {
    print(s"$title: ")
    scala.io.StdIn.readLine()
  }

  def readInt(title:String):Int = {
    readString(title).toInt
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

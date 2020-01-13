def add_odd (list: List[Int]) : Int =
  list match {
    case Nil => 0
    case head :: tail => (if (head % 2 != 0) head else 0) + add_odd(tail)
   }

add_odd(1::2::3::Nil)
add_odd(1::22::7::Nil)
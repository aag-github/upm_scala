def add_odd_positions (list: List[Int]) : Int =
  list match {
    case Nil => 0
    case head :: Nil => head
    case head :: tail => head + add_odd_positions(tail.tail)
  }

add_odd_positions(Nil)
add_odd_positions(1::Nil)
add_odd_positions(1::2::3::Nil)
add_odd_positions(1::20::3::40::5::Nil)
add_odd_positions(1::20::3::40::Nil)

def get_odd_positions[A] (list: List[A]) : List[A] =
  list match {
    case Nil => Nil
    case head :: Nil => head :: Nil
    case head :: tail => head :: get_odd_positions(tail.tail)
  }

get_odd_positions(Nil)
get_odd_positions(1::Nil)
get_odd_positions(1::2::3::Nil)
get_odd_positions(1::20::3::40::5::Nil)

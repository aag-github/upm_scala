def member[A] (item : A, list: List[A]) : Boolean =
  list match {
    case Nil => false
    case head :: _ if head == item => true
    case _::tail => member(item, tail)
  }

def member2[A] (item : A, list: List[A]) : Boolean =
  list match {
    case Nil => false
    case head :: tail  => head == item || member2(item, tail)
  }

member(1, Nil)
member(1, 1::2::Nil)
member(3, 1::2::Nil)

member2(1, Nil)
member2(1, 1::2::Nil)
member2(3, 1::2::Nil)

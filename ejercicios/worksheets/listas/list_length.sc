def list_length[A] (list: List[A]) : Integer =
  list match {
    case Nil => 0
    case _ :: tail => 1 + list_length(tail)
  }


list_length(1::2::Nil)
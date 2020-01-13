def merge[A] (list1: List[A], list2 : List[A]) : List[A] =
  list1 match {
    case Nil => Nil
    case _ => list1.head :: list2.head :: merge(list1.tail, list2.tail)
  }

merge(Nil, Nil)
merge(1::22::Nil, 33::55::Nil)
merge(1::22::Nil, 33::Nil)
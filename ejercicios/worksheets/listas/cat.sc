def cat[A](list1 : List[A], list2 : List[A]) : List[A] =
   list1 match {
     case Nil => list2
     case head :: tail => head :: cat(tail, list2)
   }

cat(1::2::Nil, 3::4::Nil)
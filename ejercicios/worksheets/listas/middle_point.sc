def tuple_middle_point(tuple : (Double, Double) ) : Double =
  tuple match {
    case (a, b) => (a + b) / 2.0
  }

tuple_middle_point((1.0,2.0))

def list_middle_point(list : List[(Double, Double)]) : List[Double] =
  list match {
    case Nil => Nil
    case head :: tail => tuple_middle_point(head) :: list_middle_point(tail)
  }



list_middle_point((1.0,2.0)::(4.0,5.0)::Nil)
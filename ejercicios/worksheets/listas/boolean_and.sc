def boolean_and(list: List[Boolean]) : Boolean =
  list match {
    case head :: tail => head && (if (tail == Nil) true else boolean_and(tail))
  }

boolean_and(true::true::true::Nil)
boolean_and(true::false::true::Nil)
boolean_and(false::false::false::Nil)
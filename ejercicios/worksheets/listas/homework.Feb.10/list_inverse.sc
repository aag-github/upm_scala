def inverse[A] (list: List[A]) : List[A] = {
  @scala.annotation.tailrec
  def inverse_acc[A](list: List[A], accumulator : List[A]) : List[A] =
    list match {
      case Nil => accumulator
      case head :: tail => inverse_acc(tail, head :: accumulator)
    }
  inverse_acc(list, Nil)
}


inverse(Nil)
inverse(1::Nil)
inverse(1::22::7::Nil)
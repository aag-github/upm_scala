def move_head_to_tail(list : List[Int])  : List[Int] =
  list match {
    case Nil => Nil
    case _ => list.tail ::: List(list.head)
  }
move_head_to_tail(1::2::3::Nil)
move_head_to_tail(2::3::Nil)

def shift(list : List[Int]) : List[List[Int]] = {
  def shift_next(list : List[Int], n : Int, acc : List[List[Int]]) : List[List[Int]] =
     n match {
       case 0 => acc
       case _ => shift_next(move_head_to_tail(list), n - a
         1, list :: acc )
     }
  shift_next(list, list.length, Nil)
}
shift(1::Nil)
shift(1::2::Nil)
shift(1::2::3::Nil)

def insert_head(new_head : Int, list : List[List[Int]]) : List[List[Int]] = {
  def insert_head_(new_head : Int, list : List[List[Int]], acc : List[List[Int]]) : List[List[Int]] =
    list match {
      case Nil => acc
      case head::tail => insert_head_(new_head, list.tail, (new_head :: list.head) :: acc)
    }
  insert_head_(new_head, list, Nil)
}
insert_head(7, List(1::2::Nil, 6::7::Nil))
insert_head(7, Nil)

def heads_permutation(head_list : List[List[Int]], acc : List[List[Int]]) : List[List[Int]] = {
  def list_permutation(list : List[Int], acc : List[List[Int]]) : List[List[Int]] =
    list match {
      case Nil => acc
      case head :: Nil => List(head) :: acc
      case head :: tail => insert_head(head, heads_permutation(shift(tail), Nil)) ::: acc
    }

  head_list match {
    case Nil => acc
    case head :: tail => heads_permutation(tail, list_permutation(head, Nil) ::: acc )
  }
}



def permutation(list: List[Int]) : List[List[Int]] =
  heads_permutation(shift(list), Nil)

permutation(Nil)
permutation(1::Nil)
permutation(1::2::Nil)
permutation(1::2::3::Nil)
permutation(1::2::3::4::Nil)
permutation(1::2::3::4::5::Nil)
permutation(1::2::3::4::5::6::Nil)

permutation(1::Nil).length
permutation(1::2::Nil).length
permutation(1::2::3::Nil).length
permutation(1::2::3::4::Nil).length
permutation(1::2::3::4::5::Nil).length
permutation(1::2::3::4::5::6::Nil).length

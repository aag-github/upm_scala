
def getInjured(secret: List[Char], proposed: List[Char], acc : Int ) : Int = {
  (secret.sorted, proposed.sorted) match {
    case (Nil, _) => acc
    case (_, Nil) => acc
    case (secret, proposed) if secret.head == proposed.head => getInjured(secret.tail, proposed.tail, acc + 1)
    case (secret, proposed) => if (secret.head < proposed.head) getInjured( secret.tail , proposed, acc)
                               else getInjured( secret , proposed.tail, acc)
  }
}

val secret = List('C', 'B', 'C')
val proposed = List('A', 'B', 'A', 'C')

getInjured(proposed, secret, 0)


getInjured(List('C', 'B', 'C'), List('C', 'A', 'C', 'B'), 0)

val secret1 = List('R', 'G', 'G', 'B').sorted
val proposed1 = List('O', 'P', 'G').sorted
getInjured(List('O', 'P', 'G'), List('R', 'G', 'G', 'B'), 0)
getInjured(List('R', 'G', 'G', 'B'), List('O', 'P', 'G'), 0)

List('A', 'B').equals(List('A', 'B'))
List('A', 'B').equals(List('A', 'C'))
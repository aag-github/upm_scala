package views

import models.ProposedCombination
import views.io.GestorIO

object ProposedCombinationsView {
  def write(combinations: List[ProposedCombination]) = {
    def build(combinations : List[ProposedCombination], count : Int, acc : String) : String = {
      combinations match {
        case Nil => acc.tail + "\n-----------"
        case head :: tail => {
          val combinationString = "\n" + CombinationViewWriter.toString(head, combinations.length + " - ")
          val proposedCombinationString = ResultView.toString(head.result_, combinationString)
          build(tail, count - 1, proposedCombinationString + acc)
        }
      }
    }
    GestorIO.writeln(build(combinations, combinations.length, ""))
  }
}

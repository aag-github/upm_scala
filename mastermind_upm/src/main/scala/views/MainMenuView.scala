package views

import controllers.GamePlayer
import views.CombinationViewReaders.{ConsoleCombinationViewReader, RandomCombinationViewReader}


class MainMenuView extends MenuView(){
    override val actionMap_ = Map[Int, (String, () => Boolean)](1 -> ("Jugar automático", autoPlay),
                                                                        2 -> ("Jugar manual", manualPlay),
                                                                        0 -> ("Quit", quit))

    def autoPlay(): Boolean = {
      GamePlayer.play(RandomCombinationViewReader)
      true
    }

    def manualPlay(): Boolean = {
      GamePlayer.play(ConsoleCombinationViewReader)
      true
    }

    def quit(): Boolean = {
      false
    }
  }

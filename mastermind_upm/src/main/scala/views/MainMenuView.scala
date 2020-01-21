package views

import controllers.GamePlayer
import views.CombinationViewReaders.{ConsoleCombinationViewReader, RandomCombinationViewReader}
import views.io.ConfirmView


class MainMenuView extends MenuView(){
    override val actionMap_ = Map[Int, (String, () => Boolean)](1 -> ("Automatic Play", autoPlay),
                                                                        2 -> ("Manual Play", manualPlay),
                                                                        0 -> ("Quit", quit))

    def autoPlay(): Boolean = {
      GamePlayer.play(RandomCombinationViewReader)
      true
    }

    def manualPlay(): Boolean = {
      GamePlayer.play(ConsoleCombinationViewReader)
      true
    }

    def quit(): Boolean =
      !ConfirmView.confirm("Desea salir?")
  }

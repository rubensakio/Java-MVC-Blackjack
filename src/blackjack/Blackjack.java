package blackjack;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import blackjack.controllers.BlackJackController;
import blackjack.models.BlackJackModel;
import blackjack.views.BlackJackView;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BlackJackModel game = new BlackJackModel();
		BlackJackView view = new BlackJackView();
		BlackJackController controller = new BlackJackController(game, view);
		view.show();
	}

}

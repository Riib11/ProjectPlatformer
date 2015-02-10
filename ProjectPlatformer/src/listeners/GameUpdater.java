package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import system.MainOperator;

public class GameUpdater implements ActionListener {

	public static MainOperator window;

	public GameUpdater() {
		window = MainOperator.window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//window.stuff()
	}
}

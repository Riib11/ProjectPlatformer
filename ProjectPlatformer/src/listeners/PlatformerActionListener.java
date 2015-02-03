package listeners;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import system.MainOperator;

public class PlatformerActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		MainOperator window = MainOperator.window;
		Graphics g = window.getGraphics();
		// Update
		window.update(g);
		// Paint
		window.paint(g);
	}
}

package screens;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import listeners.GameScreenListener;

@SuppressWarnings("serial")
public class GameScreen extends Screen {

	@Override
	public void updateLogic() {
		if (player != null)
			player.updateMove();
	}

	@Override
	public void updateDraw() {
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		if (player != null)
			player.updateDraw(g);
	}

	@Override
	public void addListeners() {
		GameScreenListener gsl = new GameScreenListener(this);
		System.out.println("Adding " + gsl.getClass());
		this.addKeyListener(gsl);
		this.addMouseListener(gsl);

	}

	@Override
	public String getName() {
		return "gamescreen";
	}

	@Override
	public void handleMousePressedInput(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleMouseReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleKeyPressedInput(KeyEvent e) {
		System.out.println("Got keyevent" + e.getKeyCode());
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			player.move(-10, 0);
			break;
		case KeyEvent.VK_RIGHT:
			player.move(10, 0);
			break;
		}
	}

	@Override
	public void handleKeyReleasedInput(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

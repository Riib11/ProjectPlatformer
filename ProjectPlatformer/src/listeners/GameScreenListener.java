package listeners;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import screens.GameScreen;

public class GameScreenListener extends ScreenListener {

	public GameScreenListener(GameScreen gamescreen) {
		super("gamescreenlistener", gamescreen);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Got keyevent" + e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Got keyevent" + e.getKeyCode());
		this.screen.handleKeyPressedInput(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Got keyevent" + e.getKeyCode());
		this.screen.handleKeyReleasedInput(e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Got mouseevent" + e.getButton());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Got mouseevent" + e.getButton());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Got mouseevent" + e.getButton());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Got mouseevent" + e.getButton());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Got mouseevent" + e.getButton());
	}

}

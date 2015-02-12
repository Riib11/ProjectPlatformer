package screens;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import objects.Enemy;
import objects.Platform;
import objects.Player;
import objects.Upgrade;
import system.MainOperator;
import listeners.GameScreenListener;

@SuppressWarnings("serial")
public class GameScreen extends Screen {

	protected Player player;
	protected ArrayList<Enemy> enemies;
	protected ArrayList<Platform> platforms;
	protected ArrayList<Upgrade> upgrades;

	public void addPlayer(Player p) {
		player = p;
	}

	public void addEnemy(Enemy e) {
		enemies.add(e);
	}

	public void addPlatform(Platform p) {
		platforms.add(p);
	}

	public void addUpgrade(Upgrade u) {
		upgrades.add(u);
	}

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
		MainOperator.window.addKeyListener(gsl);
		MainOperator.window.addMouseListener(gsl);

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
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			player.move(0, 0);
			break;
		case KeyEvent.VK_RIGHT:
			player.move(0, 0);
			break;
		}

	}

}

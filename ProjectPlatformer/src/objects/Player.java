package objects;

import java.awt.Color;
import java.awt.Graphics;

import screens.GameScreen;
import system.MainOperator;

public class Player extends Entity {

	public Player(double x, double y, double vx, double vy, double width,
			double height) {
		super(x, y, vx, vy, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateMove() {
		this.x += this.vx;
		this.y += this.vy;
	}

	@Override
	public void updateDraw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect((int) x, (int) y, (int) width, (int) height);
	}

	public void move(double vx, double vy) {
		this.vx = vx;
		this.vy = vy;
	}

	// Use this to create gameobjects!
	public static Player createPlayer(double x, double y, double vx, double vy,
			double width, double height) {
		if (!(MainOperator.window.getActiveScreen() instanceof GameScreen))
			return null;
		Player p = new Player(x, y, vx, vy, width, height);
		MainOperator.window.getActiveScreen().addPlayer(p);
		return p;
	}
}

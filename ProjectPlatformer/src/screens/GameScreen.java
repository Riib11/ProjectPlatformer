package screens;

import java.awt.Color;

public class GameScreen extends Screen {

	@Override
	public void updateDraw() {
		g.setColor(Color.BLACK);
		g.fillRect(10, 10, 50, 50);
	}

	@Override
	public void handleMouseInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleKeyInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		return "gamescreen";
	}

}

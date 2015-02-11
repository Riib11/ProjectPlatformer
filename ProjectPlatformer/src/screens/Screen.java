package screens;

import java.awt.Graphics;

import javax.swing.JComponent;

import system.Config;
import system.MainOperator;

@SuppressWarnings("serial")
public abstract class Screen extends JComponent {

	public abstract String getName();

	protected boolean isActive;
	protected Graphics g;

	public void init() {
		g = getGraphics();
		setSize(Config.WINDOW_SIZE);
		MainOperator.window.add(this);
		setVisible(false);
	}

	public abstract void updateDraw();

	public abstract void handleMouseInput();

	public abstract void handleKeyInput();

}

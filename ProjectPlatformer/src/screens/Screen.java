package screens;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComponent;

import objects.Enemy;
import objects.Platform;
import objects.Player;
import objects.Upgrade;
import system.Config;
import system.MainOperator;

@SuppressWarnings("serial")
public abstract class Screen extends JComponent {

	public abstract String getName();

	protected boolean isActive;
	protected Graphics g;

	public void init() {
		MainOperator.window.add(this);
		addListeners();
		g = getGraphics();
		setSize(Config.WINDOW_SIZE);
		setVisible(false);
	}

	public abstract void addListeners();

	public abstract void updateDraw();

	public abstract void updateLogic();

	public abstract void handleMousePressedInput(MouseEvent e);

	public abstract void handleMouseReleased(KeyEvent e);

	public abstract void handleKeyPressedInput(KeyEvent e);

	public abstract void handleKeyReleasedInput(KeyEvent e);

}

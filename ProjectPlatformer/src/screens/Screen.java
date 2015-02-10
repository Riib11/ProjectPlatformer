package screens;

import javax.swing.JComponent;

import system.Config;
import system.MainOperator;

@SuppressWarnings("serial")
public abstract class Screen extends JComponent {

	protected boolean isActive;

	public void init() {
		setSize(Config.WINDOW_SIZE);
		MainOperator.window.add(this);
		setVisible(false);
	}

	public abstract void updateScreen();

	public abstract void handleMouseInput();

	public abstract void handleKeyInput();

}

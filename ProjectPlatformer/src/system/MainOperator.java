package system;

import java.awt.Graphics;
import java.awt.Graphics2D;

//imports
import javax.swing.JFrame;
import javax.swing.Timer;

import screens.GameScreen;
import screens.OptionsScreen;
import screens.StartScreen;

@SuppressWarnings("serial")
public class MainOperator extends JFrame {

	public static MainOperator window;

	public static ActiveComponents activeComponent;
	public static Timer timer;

	public static StartScreen startScreen;
	public static OptionsScreen optionsScreen;
	public static GameScreen gameScreen;

	public MainOperator() {

	}

	public static void main(String[] args) {
		initWindow();
		initScreens();
		start();
	}

	private static void start() {
		timer = new Timer
		activeComponent = ActiveComponents.START;
	}

	private static void initWindow() {
		window = new MainOperator();
		window.setSize(Config.WINDOW_SIZE);
		window.setResizable(false);
		window.setTitle(Config.GAME_NAME);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	private static void initScreens() {
		startScreen = new StartScreen();
		optionsScreen = new OptionsScreen();
		gameScreen = new GameScreen();
	}

	// TODO Finish this Screen/Component thing

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
	}

}
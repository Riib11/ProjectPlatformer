package system;

//imports
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

import listeners.GameUpdater;
import listeners.ScreenListener;
import screens.GameScreen;
import screens.Screen;

@SuppressWarnings("serial")
public class MainOperator extends JFrame {

	public static MainOperator window;
	public static Timer timer;

	public static ArrayList<Screen> screens = new ArrayList<Screen>();
	public static ArrayList<ScreenListener> listeners = new ArrayList<ScreenListener>();

	public static Screen activeScreen;

	public static void run() {
		// Initializers:
		initWindow();
		initScreens();
		initListeners();
		// Start:
		startGame();
	}

	private static void initWindow() {
		window = new MainOperator();
		window.setSize(Config.WINDOW_SIZE);
		window.setResizable(false);
		window.setTitle(Config.WINDOW_TITLE);
		window.setVisible(true);
	}

	private static void initScreens() {
		// Instantiate Screens
		Screen gs = new GameScreen();
		// List Screens
		screens.add(gs);
		// Add Screens
		for (Screen s : screens) {
			window.add(s);
			s.init();
		}
		setActiveScreen(screens.get(0));
	}

	private static void initListeners() {
		// TODO Auto-generated method stub

	}

	private static void startGame() {
		GameUpdater gu = new GameUpdater();
		timer = new Timer(10, gu);
		timer.start();
	}

	public static Screen getActiveScreen() {
		return activeScreen;
	}

	public static void setActiveScreen(Screen activeScreen) {
		if (MainOperator.activeScreen != null)
			MainOperator.activeScreen.setVisible(false);
		MainOperator.activeScreen = activeScreen;
		MainOperator.activeScreen.setVisible(true);
	}

}
package system;

import java.util.ArrayList;

//imports
import javax.swing.JFrame;
import javax.swing.Timer;

import listeners.GameUpdater;
import screens.Screen;

@SuppressWarnings("serial")
public class MainOperator extends JFrame {

	public static MainOperator window;

	public static ActiveComponents activeComponent;
	public static Timer timer;

	public static ArrayList<Screen> screens = new ArrayList<Screen>();

	public static void main(String[] args) {
		initWindow();
		initScreens();

		// Start game
		timerStart();
	}

	private static void timerStart() {
		timer = new Timer(10, new GameUpdater());
		timer.start();
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
		// screens.add(new StartScreen());
		// screens.add(new OptionsScreen());
		// screens.add(new GameScreen());
		// for (Screen s : screens) {
		// s.init();
		// }
		// setCurrentScreen(ActiveComponents.START);
		// System.out.println("initialized Screen");
	}

}
package system;

import objects.Player;

public class Storyboard {

	public static void startLevel(int x) {
		switch (x) {
		case 1:
			Player.createPlayer(100, 100, 0, 0, 50, 50);
			break;
		default:
			break;
		}
	}
}

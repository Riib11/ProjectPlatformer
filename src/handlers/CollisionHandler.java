package handlers;

import java.awt.Rectangle;

/*
 * test commit
 */

import objects.GameObject;
import objects.Player;
import screens.GameScreen;
import system.MainOperator;


/* 
 * test commit
 * 
 * 
 * 
 */

public class CollisionHandler {

	public static boolean collide(Player p, GameObject go2) {
		int ox = ((GameScreen) MainOperator.activeScreen).screenX;
		int oy = ((GameScreen) MainOperator.activeScreen).screenY;
		System.out.println(ox + " : " + oy);
		Rectangle r1 = new Rectangle((int) (p.getX()), (int) (p.getY()),
				(int) p.getWidth(), (int) p.getHeight());
		Rectangle r2 = new Rectangle(
				(int) (((GameScreen) (MainOperator.activeScreen)).screenX + go2
						.getX()),
				(int) (((GameScreen) (MainOperator.activeScreen)).screenY + go2
						.getY()), (int) go2.getWidth(), (int) go2.getHeight());
		if (r1.intersects(r2))
			return true;
		return false;
	}

	public enum Side {
		LEFT, RIGHT, TOP, BOTTOM
	}

	public static Side collideSide(Player p, GameObject go2) {
		if (collide(p, go2)) {
			boolean leftOf = p.getX() < go2.getX();
			boolean rightOf = p.getX() > go2.getX() + go2.getWidth();
			boolean topOf = p.getY() < go2.getY() - go2.getHeight() - 10;
			boolean bottomOf = p.getY() > go2.getY() + go2.getHeight();

			boolean rightSideIn = p.getX() > go2.getX() - p.getWidth();
			boolean leftSideIn = p.getX() > go2.getX() + go2.getWidth();

			if (leftSideIn || rightSideIn) {
				if (topOf) {
					return Side.TOP;
				} else if (bottomOf) {
					return Side.BOTTOM;
				}
			} else if (leftOf) {
				return Side.LEFT;
			} else if (rightOf) {
				return Side.RIGHT;
			}
		}
		return null;
	}
	
}

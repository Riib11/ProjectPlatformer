package objects;

import java.awt.Graphics;

public class Upgrade extends GameObject {

	public Upgrade(double x, double y, double vx, double vy, double width,
			double height) {
		super(x, y, vx, vy, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean updateMove() {
		return true;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean updateDraw(Graphics g) {
		return true;
		// TODO Auto-generated method stub
	}

}

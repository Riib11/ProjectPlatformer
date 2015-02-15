package objects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class GameObject {

	protected double x;
	protected double y;

	protected double vx;
	protected double vy;

	protected double width;
	protected double height;

	protected double mass;

	protected BufferedImage img;

	protected GameObject(double x, double y, double vx, double vy,
			double width, double height, BufferedImage img) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.vx = vx;
		this.vy = vy;
		this.img = img;
	}

	/*
	 * Can be instantiated with or without an image
	 */

	public GameObject(double x, double y, double vx, double vy,
			BufferedImage img) {
		this(x, y, vx, vy, img.getWidth(), img.getHeight(), img);
	}

	public GameObject(double x, double y, BufferedImage img) {
		this(x, y, 0, 0, img.getWidth(), img.getHeight(), img);
	}

	public GameObject(double x, double y, double vx, double vy, double width,
			double height) {
		this(x, y, vx, vy, width, height, null);
	}

	public GameObject(double x, double y, double width, double height) {
		this(x, y, 0, 0, width, height, null);
	}

	/*
	 * Abstracts
	 */

	public abstract boolean updateMove();

	public abstract boolean updateDraw(Graphics g);

	/*
	 * Publics
	 */

	public boolean intersects(GameObject go) {
		if (this.x >= go.x && this.x <= go.x + go.width && this.y >= go.y
				&& this.y <= go.y + go.height) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Protecteds
	 */

	protected void defaultMove() {
		this.x += this.vx;
		this.y += this.vy;
	}

	/*
	 * Getters and Setters
	 */

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}
}

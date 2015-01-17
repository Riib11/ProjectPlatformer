package objects;

import java.awt.Rectangle;

public class GeneralObject {
	
	private double x;
	private double y;
	
	private double vx;
	private double vy;
	
	private double width;
	private double height;
	
	
	public GeneralObject(double x, double y, double width, double height){
		setPosition(x,y);
		this.width = width;
		this.height = height;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setPosition(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getVX(){
		return vx;
	}
	
	public double getVY(){
		return vy;
	}
	
	public void setVelocity(double vx, double vy){
		this.vx = vx;
		this.vy = vy;
	}
	
	public Rectangle.Double getHitbox(){
		return new Rectangle.Double(x-width/2,y-height/2, width, height);
	}
	
	public void move(){
		x += vx;
		y += vy;
	}
	
	
	
	
}

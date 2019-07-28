package hw3;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Point2D.Double;
/**
 * 
 * @author Nada ElZeini
 * class of "own shape" , represents a house shape with random primitive shapes
 */
public class HouseShape implements CompositeShape {

	private int x;
	private int y;
	private int size;

	public HouseShape(int x, int y, int size) {
		this.x=x;
		this.y=y;
		this.size=size;
	}

	@Override
	public void draw(Graphics2D g2) {
	
		

		// drew rectangle
		Rectangle2D rect = new Rectangle2D.Double(x, y, size, size);
		g2.draw(rect);

		// drawing enclosed ellipse
 
		Ellipse2D ellipse = new Ellipse2D.Double();

		ellipse.setFrame(rect);
		g2.draw(ellipse);

		// draw diagonal

		g2.draw(new Line2D.Double(x, y,  x+size, y+size));

		// draw circle
		
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = size/2;
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
		g2.draw(circle);
		
		//triangle
		g2.draw(new Line2D.Double(x, y, x+size/2, y-size));
		g2.draw(new Line2D.Double(x+size/2,  y-size, x+size,y));
		
	}
	

	@Override
	public void setY(int y) {
this.y=y;
		
	}

	@Override
	public void setX(int x) {
		this.x=x;
		
	}
	@Override
	public int getX() {
		return x;
	}


	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	
	}



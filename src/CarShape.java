

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class CarShape  implements ShapeIcon , CompositeShape {

	private int x;
	private int y;
	private int width;
	public CarShape() {
		
	}
	public CarShape(int x,int y,int width) {
		this.x=x;
		this.y=y;
		this.width=width;
	}
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {

		Graphics2D g2 = (Graphics2D)g;
		this.draw(g2);
		
	}
	@Override
	public int getIconWidth() {
	return width;
	}
	@Override
	public int getIconHeight() {
		return width;
	}
	@Override
	public void draw(Graphics2D g2) {
		Rectangle2D body = new Rectangle2D.Double(x, y+width/6, width-1, width/6);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x + width / 6, y + width / 3, width / 6, width / 6); 
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,width / 6, width / 6); 
		// The bottom of the front windshield 
		Point2D.Double r1 = new Point2D.Double(x + width / 6,y+width/6); 
		// The front of the roof 
		Point2D.Double r2 = new Point2D.Double(x + width / 3, y);
		// The rear of the roof 
		Point2D.Double r3 = new Point2D.Double(x+ width*2 / 3,y); 
		Point2D.Double r4 = new Point2D.Double(x + width * 5 / 6, y+width/6);
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield =  new Line2D.Double(r3,r4);
		
		g2.draw(body); 
		g2.draw(frontTire); 
		g2.draw( rearTire); 
		g2. draw(frontWindshield) ; 
		g2. draw( roofTop) ; 
		g2. draw( rearWindshield) ;
		
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x=x;
	}
	@Override
	public void setY(int y) {
	this.y=y;
		
	}
	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean contains(double x, double y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Point2D p) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean intersects(double x, double y, double w, double h) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean intersects(Rectangle2D r) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(double x, double y, double w, double h) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Rectangle2D r) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}



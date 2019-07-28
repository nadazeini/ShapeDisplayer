package hw3;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Nada ElZeini
 * interface that defines a composite shape
 */
public interface CompositeShape  {
	/**
	 * draw method that draws the shape
	 * @param g2
	 */
	public void draw(Graphics2D g2);
	/**
	 * set x to use when drawing shape 
	 * @param x
	 */
	 public void setX(int x);
	 /**
	  * set y to use when drawing shape 
	  * @param y
	  */
	 public void setY(int y);
	 /**
	  * get x to use when drawing shape 
	  * @return x
	  */
	 public int getX();
	 /**
	  * get y to use when drawing shape 
	  * @return y
	  */
	 public int getY();
	 /**
	  * get size of shape 
	  * @return size
	  */
	 public int getSize();
	
}

package hw3;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;
import javax.swing.JButton;
/**
 * 
 * @author Nada ElZeini
 * class that represent an Icon in a specific shape
 */
public class  ShapeIcon implements Icon {

	private CompositeShape compositeShape;
	private int height;
	private int width;
	/**
	 * constructor that creates shapeIcon for specified composite shape
	 * @param compositeShape
	 */
	public ShapeIcon(CompositeShape compositeShape) {
		this.compositeShape=compositeShape;
	
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
	
			 compositeShape.draw(g2);
		
		 
	    		
	    	
	}


	@Override
	public int getIconWidth() {
		return compositeShape.getSize();

	}

	@Override
	public int getIconHeight() {
		
		return compositeShape.getSize();
	}
	
}

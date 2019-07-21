import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class SnowmanShape implements ShapeIcon ,CompositeShape{

	private int x;
	private int y;
	private int width;
	
	public SnowmanShape(int x,int y,int width) {
		this.x=x;
		this.y=y;
		this.width=width;
	}
	@Override
	public void draw(Graphics2D g2) {
	
		Ellipse2D.Double top = new Ellipse2D.Double(x,y,10,10);
		Ellipse2D.Double bot = new Ellipse2D.Double(x,y+10,10,10);
		g2.draw(top);
		
		g2.draw(bot);
	
	}

	@Override
	public void setX(int x) {
		this.x=x;
		
	}

	@Override
	public void setY(int y) {
		this.y=y;
		
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

}

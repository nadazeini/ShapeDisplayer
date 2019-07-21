import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;

public interface CompositeShape   {
	
	public void draw(Graphics2D g2);
	 public void setX(int x);
	 public void setY(int y);
}

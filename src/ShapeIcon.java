import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public interface ShapeIcon extends Icon {

	public void paintIcon(Component c, Graphics g, int x, int y);
	public int getIconWidth();
	public int getIconHeight();

}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ShapeDisplayer extends JFrame{

	private CompositeShape shape;
	private int x,y;
	public static void main(String [] args) {
		new ShapeDisplayer();
	}

 public ShapeDisplayer() {
	JFrame frame = new JFrame("Shape Displayer");
	JLabel buttonsLabel = new JLabel();
	JPanel panel = new JPanel();
	JPanel panelButtons = new JPanel();
	panelButtons.setBackground(Color.blue);
	panel.setBackground(Color.yellow);
	JButton carButton = new JButton();
	carButton.setIcon(new CarShape(20,20,50));
	carButton.setPreferredSize(new Dimension(90,70));
	carButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
		
			shape = new CarShape(x,y,50);
			
		}
	});
	panel.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
			shape.setX(e.getX());
			shape.setY(e.getY());
			Graphics2D g2 = (Graphics2D)panel.getGraphics();
		    shape.draw(g2);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	JButton snowButton = new JButton();
	snowButton.setPreferredSize(new Dimension(90,70));
	snowButton.setIcon(new SnowmanShape(40,20,50));
	snowButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
		
			shape = new SnowmanShape(x,y,50);
			
		}
	});
	
	JButton compShapeButton = new JButton();
	compShapeButton.setPreferredSize(new Dimension(90,70));
	
	
	
	frame.add(panel,BorderLayout.CENTER);
	panelButtons.add(carButton,FlowLayout.LEFT);
	panelButtons.add(snowButton,FlowLayout.CENTER);
	panelButtons.add(compShapeButton,FlowLayout.RIGHT);
    frame.add(panelButtons,BorderLayout.NORTH);
	
	
	frame.setSize(400,400);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }}


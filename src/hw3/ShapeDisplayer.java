package hw3;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
/**
 * 
 * @author Nada ElZeini
 * class that contains main method
 */
public class ShapeDisplayer extends JFrame{

	private CompositeShape shape;
	private int x,y;
	public static void main(String [] args) {
		new ShapeDisplayer();
	}
/**
 * Constructor
 */
 public ShapeDisplayer() {
	JFrame frame = new JFrame("Shape Displayer");
	JLabel buttonsLabel = new JLabel();
	JPanel panel = new JPanel();
	JPanel panelButtons = new JPanel();
	panelButtons.setBackground(Color.white);
	panel.setBackground(Color.yellow);

	
	JButton carButton = new JButton();
	JButton houseButton = new JButton();
	JButton snowButton = new JButton();
	ShapeIcon carIcon = new ShapeIcon(new CarShape(20,20,50));
	
	carButton.setIcon(carIcon);
	carButton.setPreferredSize(new Dimension(90,70));
	
	houseButton.setPreferredSize(new Dimension(90,70));
	ShapeIcon starIcon = new ShapeIcon(new HouseShape(30,30,20));
	carButton.setBorder(new LineBorder(Color.blue));
	
	houseButton.setBorder(new LineBorder(Color.blue));

	snowButton.setBorder(new LineBorder(Color.blue));
	houseButton.setIcon(starIcon);
	
snowButton.setPreferredSize(new Dimension(90,70));
	
	ShapeIcon snowIcon = new ShapeIcon(new SnowmanShape(35,15,20));
	
	snowButton.setIcon(snowIcon);
	

	
	carButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			
			shape = new CarShape(x,y,50);
			
			carButton.setBorder(new LineBorder(Color.red));
		
			houseButton.setBorder(new LineBorder(Color.blue));
		
			snowButton.setBorder(new LineBorder(Color.blue));
			
		}
	});
	
	snowButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			
			shape = new SnowmanShape(x,y,20);
			carButton.setBorder(new LineBorder(Color.blue));
			houseButton.setBorder(new LineBorder(Color.blue));
			snowButton.setBorder(new LineBorder(Color.red));
			
		}
	});
	

	
	houseButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			
			shape = new HouseShape(x,y,20);
			carButton.setBorder(new LineBorder(Color.blue));
			snowButton.setBorder(new LineBorder(Color.blue));
			houseButton.setBorder(new LineBorder(Color.red));
			
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
	
	
	frame.add(panel,BorderLayout.CENTER);
	panelButtons.add(carButton,FlowLayout.LEFT);
	panelButtons.add(snowButton,FlowLayout.CENTER);
	panelButtons.add(houseButton,FlowLayout.RIGHT);
    frame.add(panelButtons,BorderLayout.NORTH);
	
	
	frame.setSize(400,400);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	

 }
 

}
 


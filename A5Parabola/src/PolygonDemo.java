import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;


public class PolygonDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Polygon Demo");
		
		frame.add(new A5Polygon());

		frame.setSize(new Dimension(1000,1000));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		//new Polygon();
	}
}

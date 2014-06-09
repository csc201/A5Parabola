import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;


public class DrawPolygon extends JFrame{

		public DrawPolygon() {
			setTitle("Draw Polygon");
			add(new PolygonPanel());
		}
		
		public static void main(String [] args) {
			DrawPolygon frame = new DrawPolygon();
			frame.setSize(new Dimension(1000,1000));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		}
}


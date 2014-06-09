import java.awt.*;

import javax.swing.JPanel;

class PolygonPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw the triangle top points upward
		//int []xPoints = {0,100,50};
		//int []yPoints = {87,87,10};
		//g.drawPolygon(xPoints, yPoints, 3);
		
		
		//draw a prabola
	/*	Polygon p = new Polygon();
		double scaleFactor = 0.1;
		for (int x=-100; x<=100; x++) {

			p.addPoint(x+200, 200- (int)(scaleFactor *x *x));

		}
		g.drawPolygon(p);*/
		
		//draw the triangle top points downward
		/*Polygon p = new Polygon();
		p.addPoint(0,10);
		p.addPoint(50,87);
		p.addPoint(100,10);
		g.drawPolygon(p);
		*/
		
		/*double scaleFactor = 0.1;
		for (int x=-100; x<=100; x++) {

		p.addPoint(x+200, 200- (int)(scaleFactor *x *x));

		}*/
		
		
		/*g.drawLine(5, 5, 100, 100);
		g.drawString("Test", 100, 100);
		g.drawOval(100, 100, 50, 50);
		*/
	}
}
import java.awt.Graphics;

import javax.swing.*;


public class PolygonDrawing extends JFrame {
	JPanel panel = new PolygonPanel();
	public PolygonDrawing() {
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}


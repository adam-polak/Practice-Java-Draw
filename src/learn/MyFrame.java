package learn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = -1408105551780244366L;
	
	private class MyPanel extends JPanel {
		
		final int BASELINE = 450;
		final int TOPLINE = 50;
		final int MAX_LEFT = 50;
		final int MAX_RIGHT = 450;
		final int YMID = ((TOPLINE + BASELINE) / 2);
		final int XMID = ((MAX_LEFT + MAX_RIGHT) / 2);
		
		MyPanel() {
			setSize(500,500);
			setPreferredSize(new Dimension(500,500));
		}
		
		@Override
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.red);
//			//Top Line
			g2.drawLine(MAX_LEFT, TOPLINE, MAX_RIGHT, TOPLINE);
//			//BaseLine
			g2.drawLine(MAX_LEFT, BASELINE, MAX_RIGHT, BASELINE);
//			//Left/Right Line
			g2.drawLine(MAX_LEFT, TOPLINE, MAX_LEFT, BASELINE);
			g2.drawLine(MAX_RIGHT, TOPLINE, MAX_RIGHT, BASELINE);
//			//x-axis
			g2.drawLine(MAX_LEFT, YMID, MAX_RIGHT, YMID);
//			//y-axis
			g2.drawLine(XMID, TOPLINE, XMID, BASELINE);
		}
		
		
		
	}
	
	MyFrame() {
		setSize(500,550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanel graph = new MyPanel();
		setResizable(false);
		add(graph);
		setVisible(true);
	}
}

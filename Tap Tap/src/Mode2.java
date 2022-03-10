import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// Basically Piano Tiles mobile game

public class Mode2 extends JPanel {		// Make this like "Don't tap the White Tiles"

	public static JPanel canvas;
	public JFrame window = new JFrame("Tap Falling Tiles");
	private Timer tmr;
	
	Random rnd = new Random();	
	Boxx b = new Boxx(20, 40, 50, 80, Color.BLACK);
	
	ArrayList<Boxx> boxes = new ArrayList<>();
	
	public Mode2() {
		
		//============================ window/GUI code
				canvas = this;
				
				window.setBounds(100, 100, 375, 667);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setAlwaysOnTop(true);
			//	window.setExtendedState(JFrame.MAXIMIZED_BOTH);		// This makes the GUI start maximized
				window.setResizable(false);
				window.getContentPane().add(this);
				window.setVisible(true);
						
			
		//==================================================
				
				tmr = new Timer(700, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						boxes.add(new Boxx(rnd.nextInt(canvas.getWidth()-50), canvas.getHeight()-780, b.width, b.height, b.color));
						repaint();
					}
				});
				tmr.start();		
				
				tmr = new Timer(25, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						for (int i = boxes.size()-1; i >= 0; i--) {
							boxes.get(i).update();
						}
						repaint();
						}
					});
					tmr.start();
			
			canvas.addMouseListener(new MouseListener() {
	
				@Override
				public void mousePressed(MouseEvent e) {

					for (Boxx b : boxes) {
					if (e.getX() >= b.x && e.getY() >= b.y) {				// Top and Left *DONE*
						if (e.getY() <= b.y+b.height && e.getX() <= b.x+b.width) {		// Bottom and Right *DONE*
							int x = e.getX(); int y = e.getY(); System.out.println(x + ", " + y);
							boxes.remove(b);
//							b.setLocation(rnd.nextInt(canvas.getWidth()-b.width), rnd.nextInt(canvas.getHeight()-b.height));
							repaint();
						}	}
					}
				}
				@Override public void mouseExited(MouseEvent e) {}
				@Override public void mouseEntered(MouseEvent e) {}
				@Override public void mouseClicked(MouseEvent e) {}
				@Override public void mouseReleased(MouseEvent e) {}
				
			});
	
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	//	b.draw(g);
		
		for (int i = boxes.size()-1; i >= 0; i--) {
			boxes.get(i).draw(g);
			boxes.get(i).update2();
		}
	}
	
	public static void main(String[] args) {
		new Mode2();
	}
}

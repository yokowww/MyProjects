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

import org.omg.Messaging.SyncScopeHelper;

public class Mode1 extends JPanel {

	public static JPanel canvas;
	public JFrame window = new JFrame("Tap Tap Test");
	private Timer tmr;
	
	public boolean okay;
	public int seconds;
	public long milliseconds;
	
	Random rnd = new Random();	
	Boxx b = new Boxx(20, 40, 50, 50, Color.GREEN);
	
	//ArrayList<Boxx> boxes = new ArrayList<>();
	//Boxx [] boxes2 = new Boxx[5];
	
	public Mode1() {
		
		//============================ window/GUI code
				canvas = this;
				
				window.setBounds(100, 100, 800, 800);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setAlwaysOnTop(true);
			//	window.setExtendedState(JFrame.MAXIMIZED_BOTH);		// This makes the GUI start maximized
				window.setResizable(false);
				window.getContentPane().add(this);
				window.setVisible(true);
						
	
		//============================================= Temporary Timer to move box to random location every second
				
//			tmr = new Timer(10000, new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					b.setLocation(rnd.nextInt(canvas.getWidth()), rnd.nextInt(canvas.getHeight()));
//					repaint();
//				}
//			});
//			tmr.start();
		//=============================================
			
			canvas.addMouseListener(new MouseListener() {
	
				@Override
				public void mousePressed(MouseEvent e) {
					if (e.getX() >= b.x && e.getY() >= b.y) {				// Top and Left *DONE*
						if (e.getY() <= b.y+b.height && e.getX() <= b.x+b.width) {		// Bottom and Right *DONE*
							int x = e.getX(); int y = e.getY(); System.out.println(x + ", " + y);
							b.setLocation(rnd.nextInt(canvas.getWidth()-b.width), rnd.nextInt(canvas.getHeight()-b.height));
							b.fine = true;
							repaint();
						}	}
				}
				@Override public void mouseExited(MouseEvent e) {}
				@Override public void mouseEntered(MouseEvent e) {}
				@Override public void mouseClicked(MouseEvent e) {}
				@Override public void mouseReleased(MouseEvent e) {}
				
			});
			
			seconds = 0;
			
			
			// Test code for the seconds timer
			tmr = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					
					System.out.println(++seconds + " " + b.fine);
					
					if ((seconds == 2) && (b.fine == false)) {
						System.out.println("GAME OVER GAME OVER GAME OVER GAME OVER");
						tmr.stop();
					} else if (((seconds == 1)||(seconds == 2))  && (b.fine == true)) {
						b.fine = false;
						seconds = 0;
					}
				}
			});
			tmr.start();
			
			
			
			
	
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		b.draw(g);
	}
	
	public static void main(String[] args) {
		new Mode1();
	}
}

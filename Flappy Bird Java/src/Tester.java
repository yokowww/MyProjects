import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tester extends JPanel {

	public static JPanel canvas;
	public JFrame window = new JFrame("Flappy Bird");
	private Timer tmr;
	
	
	ArrayList<Pipes> pipes = new ArrayList<>();
//	Pipes [] pipes = new Pipes[1];
	
	int score = 0;
	
	Random rnd = new Random();
	
					//50, 300, 20, 20, 10, 10, rnd color
	Bird a = new Bird(50, 300, 32, 32, 20, 10, new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));
	

	public Tester() {

		//============================= Stuff for the window
		canvas = this;

		window.setBounds(100, 100, 375, 667);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAlwaysOnTop(true);
//		window.setExtendedState(JFrame.MAXIMIZED_BOTH );
		window.setResizable(false);
		window.getContentPane().add(this);
		window.setVisible(true);
		
		//======================================== Listening to mouse click
		
		window.addMouseListener(new MouseListener() {
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				a.up();
			}
			
			
			@Override public void mouseReleased(MouseEvent e) {}
			@Override public void mouseExited(MouseEvent e) {}
			@Override public void mouseEntered(MouseEvent e) {}
			@Override public void mouseClicked(MouseEvent e) {}
		});
		// ================================================================
		
		
		//======================================= Timer 
		tmr = new Timer(25, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				a.update();
				repaint();
			}
		});
		
		tmr.start();
		
		 if (a.y + 32 == canvas.getHeight()) {
			 JOptionPane.showMessageDialog(canvas, "Game Over");
			 tmr.stop();
		 }
		 
		 
		 
		//=============================================
		
		// ======================================= Timer for pipes
		//pipes.add(new Pipes());
		
		tmr = new Timer(2200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pipes.add(new Pipes());
			}
		});
		
		tmr.start();
		
		// =======================================================
		
//		for (Pipes p : pipes)
//			if (p.x + p.width < a.x && !p.hits(a)) {
//				score += 1;
//				System.out.println("Score:" + score);
//			}
	}
	
	
		
			
 

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			a.draw(g);
			
			for (int i = pipes.size()-1; i >= 0; i--) {
				pipes.get(i).draw(g);
				pipes.get(i).update();
				
				
				if (pipes.get(i).hits(a)) {
					System.out.println("HITS");
//					for (Pipes p : pipes)
//						pipes.remove(p);
//					 JOptionPane.showMessageDialog(canvas, "Game Over");
//					 tmr.stop();
				//	a.drop();
				}
			
			
				if (pipes.get(i).offscreen()) {
					pipes.remove(i);
				}
				
				
				
//				if (a.fell()) {
//					//System.out.println("GAME OVER!!");
//					infoBox("GAME OVER", "Game Over");
//					//pipes.clear();		// Destroy all pipes and stop the game
//				}
				
//				if (pipes.get(i).goesThrough(a)) {
//					System.out.println(pipes.get(i).count);
//				}
				
			}
			
//			public void paintComponent(Graphics g) {
//				super.paintComponent(g);
//					a.draw(g);
//					
//					for (int i = 0; i < pipes.size(); i++) {
//						pipes.get(i).draw(g);
//						pipes.get(i).update();
//						
//						
//						if (pipes.get(i).hits(a)) {
//							System.out.print("It hit  ");
//						}
//					}
//			
			
	}
	
//	 public static void gameOver(Bird b, Pipes p) {
//		 if (b.height > canvas.getHeight()) {
//			 JOptionPane.showMessageDialog(canvas, "Game Over");
//		 }
//	 }
	 
	public static void main(String[] args) {
		new Tester();
	}
}

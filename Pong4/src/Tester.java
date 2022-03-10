
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.OptionPaneUI;

public class Tester extends JPanel {

	public static JPanel canvas;
	public JFrame window = new JFrame("Pong - 4");
	private Timer tmr;
	Ball ball = null;
	
	Random rnd = new Random();
	
	ArrayList<Paddle> paddles = new ArrayList<>();
	
	public Tester() {
	
		canvas = this;
				
		window.setBounds(100, 100, 800, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAlwaysOnTop(true);
//		window.setExtendedState(JFrame.MAXIMIZED_BOTH);		// This makes the GUI start maximized
		window.setResizable(false);
		window.getContentPane().add(this);
		window.setVisible(true);
		
		ball = new Ball(this.getWidth()/2 - 5, this.getHeight()/2-5, 20, (rnd.nextInt(5)+1) * (rnd.nextBoolean() ? 1 : -1), (rnd.nextInt(5)+1) * (rnd.nextBoolean() ? 1 : -1), this);
		
		
		
		tmr = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ball.move(paddles)) {
					tmr.stop();
					repaint();
					JOptionPane.showMessageDialog(window, "Game Over!!");
				}
				repaint();
			}
		});
		
		paddles.add(new Paddle(30, 0, 60, 30, enuDirection.VERTICAL, this));
		paddles.add(new Paddle(canvas.getWidth() - 60, 0, 60, 30, enuDirection.VERTICAL, this));
		paddles.add(new Paddle(0, 30, 60, 30, enuDirection.HORIZONTAL, this));
		paddles.add(new Paddle(0, canvas.getHeight() - 60, 60, 30, enuDirection.HORIZONTAL, this));
		
		window.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {	
				for (Paddle p : paddles)
					p.moveTo(e.getPoint());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				mouseMoved(e);
			}
		});
		
		tmr.start();
		
	
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
		for (Paddle p : paddles)
			p.draw(g);
	}
	
	public static void main(String[] args) {
		new Tester();
	}
	
}
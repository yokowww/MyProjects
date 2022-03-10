import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tester extends JPanel {

	public static JPanel canvas;
	public JFrame window = new JFrame("Kaboom");
	private Timer tmr;
	
	ArrayList<Bomb> bombs = new ArrayList<Bomb>();
	
	Random rnd = new Random();		// will use this to drop balls

	Bucket a = new Bucket(getWidth(), getHeight()+725, 100, 25, Color.red);
	
	public int score = 0;
	public JLabel sc = new JLabel(Integer.toString(score)); //Integer.toString(score);
	
	public static int fallSpeed = 1200;
	
	
	public Tester() {
	
		//============================ window/GUI code
		canvas = this;
		
		window.setBounds(100, 100, 800, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAlwaysOnTop(true);
	//	window.setExtendedState(JFrame.MAXIMIZED_BOTH);		// This makes the GUI start maximized
		window.setResizable(false);
		window.getContentPane().add(this);
		window.setVisible(true);
		
		sc.setBounds(canvas.getWidth()/2, canvas.getHeight()/2, 100, 100);
		sc.setSize(200, 200);
		sc.setForeground(Color.BLACK);		//new Color(229, 217, 82)
		sc.setFont(new Font("Courier New", Font.BOLD, 30));
		canvas.add(sc);
		
		//======================================================== Mouse move
				window.addMouseMotionListener(new MouseMotionListener() {
					
					@Override
					public void mouseMoved(MouseEvent e) {
						// You would tell an object here where to move to.
						// e has the x and y of the mouse
						a.moveTo(e.getX());
					}
					
					@Override
					public void mouseDragged(MouseEvent e) {
						mouseMoved(e);
					}

				});
		
				
//				if (score > 200 && score%200 == 0) {
//					fallSpeed -= 1000;
//				}
		
		//================================================== Timer for falling bombs
		tmr = new Timer(700, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bombs.add(new Bomb());
				repaint();
			}
		});
		tmr.start();		
		
			tmr = new Timer(25, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = bombs.size()-1; i >= 0; i--) {
					bombs.get(i).update();
				}
				repaint();
				}
			});
			tmr.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (score < 200)
		a.draw(g);
		else if (score >= 200 && score < 500)
		a.draw2(g);
		else if (score >= 500)
		a.draw3(g);
		
		for (int i = bombs.size()-1; i >= 0; i--) {
			bombs.get(i).draw(g);
			bombs.get(i).update2();
			
			if (score < 200) {
			if (bombs.get(i).hits(a)) {	
				System.out.println("It hit");
				bombs.remove(i);
				score += 5;
				sc.setText(Integer.toString(score));
			}
			}else if (score >= 200 && score < 500) {
				if (bombs.get(i).hits2(a)) {
					System.out.println("It hit");
					bombs.remove(i);
					score += 5;
					sc.setText(Integer.toString(score));
			}
			}else if (score >= 500) {
				if (bombs.get(i).hits3(a)) {
					System.out.println("It hit");
					bombs.remove(i);
					score += 5;
					sc.setText(Integer.toString(score));
			}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new Tester();
	}
	
	
}

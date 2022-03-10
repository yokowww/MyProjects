import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Bird extends Rectangle {

	// This class is for the Bird image
	// For the mean time I will use a Ball as the bird
	
	public int x, y, mx, my, width, height;
	public Color color;
	Timer tmr;
	public boolean jumping;
	public double gravity = 0.6;
	public double lift = -15;
	public double velocity = 0;
	
	public Bird(int x, int y, int width, int height, int mx, int my, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.mx = mx;
		this.my = my;
		this.color = color;
	}
	
	public void move() {
		
		x += mx;
		y += my;

		x = 20;
		if (y - Tester.canvas.getHeight() > 0) {
			y += 1;
		}
		
	}
	
	public void jump() {
		
		x += mx;
		y += my;
//		
//		x = 20;
//		if (y - Tester.canvas.getHeight() > 0) {
//			y -= 1;
//		}
		
	// Timer trial for jump
//		tmr = new Timer(20, new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (y - Tester.canvas.getHeight() < 0) {
//					y -= 1;
//				}
//			}
//		});
//		
//		tmr.start();
	// /////////////////////////////////////////////
		
		x = 20;
		
//		for (int i = 20; i > 0; i--) {
//			if (y - Tester.canvas.getHeight() > 0)
//				y -= i;
//				Tester.canvas.repaint();
//		}
		
		if (y > 0) {
			for(int i = 20; i > 0 ; i--)
				y -= i;
		}	
		
}
	
	public void update() {
		velocity += gravity;
		velocity *= 0.9;
		y += velocity;
		
		
		if (y > Tester.canvas.getHeight()-10) {
			y = Tester.canvas.getHeight()-10;
			velocity = 0;
		}
		
		if (y < 0) {
			y = 0;
			velocity = 0;
		}
	}
	
	public void up() {
		velocity += lift;
		
	}
	
	public void draw(Graphics g) {
		
		// Drawing the ball
		g.setColor(color);
		g.fillOval(x, y, width, height);
		g.setColor(Color.black);
		g.drawOval(x, y, width, height);
		
		// Image stuff goes here later
		update();
			
	}
	
	public void drop() {
		x += mx;
		y += my;

		x = 20;
		
		if (y - Tester.canvas.getHeight() > 0) {
			y += 1;
		}
	}
	
//	public void gameOver() {
//		if (y < Tester.canvas.getHeight())
//			System.out.println("GAME OVER");
//	}
	
	public boolean fell() {
		return (y + 20 > Tester.canvas.getHeight()); 
	}
	
	
}

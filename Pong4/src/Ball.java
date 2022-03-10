import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class Ball extends Rectangle {

	Random rnd = new Random();
	
//	public int x = rnd.nextInt(Tester.canvas.getWidth() - 25);
//	public int y = 100;
//	public int mx = rnd.nextInt(Tester.canvas.getWidth() - 25);
//	public int my = 100;
//	public int width = 25;
//	public int height = 25;
//	public Color color = new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
	
	public JPanel canvas = new JPanel();
	
	public int xSpeed, ySpeed;
	
	public Ball(int x, int y, int size, int xSpeed, int ySpeed, JPanel canvas) {
		super(x,y,size,size);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.canvas = canvas;
	}
	
	public boolean move(ArrayList<Paddle> paddles) {
		x += xSpeed;
		y += xSpeed;
		
		if ((x + width > canvas.getWidth()) || x < 0)
			return true;
		if ((y + height > canvas.getHeight()) || y < 0)
			return true;
		
		for (Paddle p : paddles)
			if(p.intersects(this)) {
				if (p.direction == enuDirection.VERTICAL) {
					xSpeed = -xSpeed;
					break;
				} else {
					ySpeed = -ySpeed;
					break;
				}
			}
		
		return false;
	}

	public void draw(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
			
	}
	
}
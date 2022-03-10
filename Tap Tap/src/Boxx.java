

	import java.awt.Color;
	import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;

	public class Boxx extends Rectangle {
		
		public int speed = 2;
		public double gravity = 0.6;
		public double velocity = 0;
		
		public static boolean fine = false;
		
		Random rnd = new Random();
		public Point p;
		public Color color;

		public Boxx(int x, int y, int width, int height, Color color) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.color = color;
		}
		
		public void move() {
			
			//fine = true;
			
			// Change position of box
			x = rnd.nextInt(Mode1.canvas.getWidth());
			y = rnd.nextInt(Mode1.canvas.getHeight());
		}
		
		public void draw(Graphics g) {
			
			g.setColor(color);
			g.fillRect(x, y, width, height);
			g.setColor(Color.BLACK);
			g.drawRect(x, y, width, height);
			
		}
			
		public void update() {
			velocity += gravity;
			velocity *= 0.9;
			y += velocity;
			
			
			if (y > Mode2.canvas.getHeight()-10) {
				y = Mode2.canvas.getHeight()-10;
				velocity = 0;
			}
			
			if (y < 0) {
				y = 0;
				velocity = 0;
			}
		}
		
		public void update2() {
			y += speed;
		}
		
	}

	


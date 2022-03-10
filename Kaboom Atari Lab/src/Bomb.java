import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Bomb extends Rectangle {
	
	Random rnd = new Random();
	
	// Class for dropping bombs
	
	public int x = rnd.nextInt(Tester.canvas.getWidth() - 25);
	public int y = 100;
	public int mx = rnd.nextInt(Tester.canvas.getWidth() - 25);
	public int my = 100;
	public int width = 25;
	public int height = 25;
	public Color color = new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
	
	public int speed = 2;
	public double gravity = 0.6;
	public double velocity = 0;
	
	public void fall() {
		x += mx;
		y += my;
		
		x = 20;
		if (y - Tester.canvas.getHeight() > 0)
			y += 1;
	}

	public void draw(Graphics g) {
		// setColor(outline), fillOval, setColor(color to fill oval), drawOval
		// ^^ That is the order of drawing circles
		
		// Drawing a ball/bomb
		g.setColor(color);
		g.fillOval(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
		
		//update();
		
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
	
	public boolean hits(Bucket b) {
		if (y + height >= Tester.canvas.getHeight() - b.height - 10 && velocity > 0)
			if (x + width >= b.x && x <= b.x + b.width)
				return true;
					
		return false;
	}
	
	public boolean hits2(Bucket b) {
		if (y + height >= Tester.canvas.getHeight() - b.height - 53 && velocity > 0)
			if (x + width >= b.x && x <= b.x + b.width)
				return true;
					
		return false;
	}
	
	public boolean hits3(Bucket b) {
		if (y + height >= Tester.canvas.getHeight() - b.height - 100 && velocity > 0)
			if (x + width >= b.x && x <= b.x + b.width)
				return true;
					
		return false;
	}
	
	public void update2() {
		y += speed;
	}
	
}

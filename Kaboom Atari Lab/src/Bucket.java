import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bucket extends Rectangle {


	public Color color;

	public Bucket(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		moveTo(x);
	}

	public void moveTo(int x) {
		this.x = x - width/2;
	}
	
	public void draw(Graphics g) {
		
		g.setColor(color);
		g.fillRect(x, y, width, height);
		
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		
	}
	
	public void draw2(Graphics g) {
		
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.fillRect(x, y - height - 12, width, height);
		
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		g.drawRect(x, y - height - 12, width, height);
		
	}
	
	public void draw3(Graphics g) {
		
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.fillRect(x, y - height - 12, width, height);
		g.fillRect(x, y - height - 48, width, height);
		
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		g.drawRect(x, y - height - 12, width, height);
		g.drawRect(x, y - height - 48, width, height);
		
	}

	
	
}

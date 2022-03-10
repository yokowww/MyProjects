import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Paddle extends Rectangle {

	public JPanel canvas = new JPanel();
	public enuDirection direction;
	
	public Paddle(int x, int y, int longSide, int shortSide, enuDirection direction, JPanel canvas) {
		super.x = x;
		super.y = y;
		
		if (direction == direction.HORIZONTAL) {
			super.width = longSide;
			super.height = shortSide;
		} else if (direction == direction.VERTICAL) {
			super.width = shortSide;
			super.height = longSide;
		}
			
		this.direction = direction;
		this.canvas = canvas;
	}
	
	
	void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
	}
	
	public void moveTo(Point p) {
		if(direction == direction.VERTICAL) 
			y = p.y - width/2;
		else if (direction == direction.HORIZONTAL)
			x = p.x - height/2;
		else {
			y = p.y - width/2;
			x = p.x - height/2;
		}
	}
}
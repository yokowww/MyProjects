import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class Pipes extends Rectangle{

	Random rnd = new Random();
	
	int spacing = 100; //rnd.nextInt((Tester.canvas.getHeight() - 20) + 20);
	int centery = rnd.nextInt(((Tester.canvas.getHeight()-(spacing-30)) - spacing) + spacing);
	
	int top = centery - spacing / 2;
	int bottom = (Tester.canvas.getHeight()) - (centery + spacing / 2);
	
	int x = Tester.canvas.getWidth();
	int width = 42;
	Color color;
	int speed = 2;
	Timer tmr;
	boolean highlight = false;
	int count = 0;
	
	
	public void draw(Graphics g) {
		
		if(highlight) {
		g.setColor(Color.red);
		g.fillRect(x, 0, width, top);
		g.setColor(Color.red);
		g.drawRect(x, 0, width, top);
		
		g.setColor(Color.red);
		g.fillRect(x, Tester.canvas.getHeight()-bottom, width, bottom);
		g.setColor(Color.red);
		g.drawRect(x, Tester.canvas.getHeight()-bottom, width, bottom);
		
		} else {
			g.setColor(color);
			g.fillRect(x, 0, width, top);
			g.setColor(color);
			g.drawRect(x, 0, width, top);
			
			g.setColor(color);
			g.fillRect(x, Tester.canvas.getHeight()-bottom, width, bottom);
			g.setColor(color);
			g.drawRect(x, Tester.canvas.getHeight()-bottom, width, bottom);
		}
		
	}
	
	public boolean offscreen() {
		if (x < -width)
			return true;
		else 
			return false;
	}
	
	public boolean hitss(Bird b, Pipes p) {
		
		if (b.intersects(p)) {
			highlight = true;
			return true;
		}
		return false;
		
	}
	
	public boolean hits(Bird b) {
		
		if (b.y < top || b.y > Tester.canvas.getHeight()-bottom) {
			if (b.x > x && b.x < x + width) {
				highlight = true;
				return true;
			}
			
			if (b.width < x && b.width > x + width) {
				highlight = true;
				return true;
			}
			
		}
		
		//==========================================================
		// Calculated Bounds
//		
//			// Firstly, if it touches sides of pipes
//			if (b.y < top || b.y > Tester.canvas.getHeight()-bottom) {
//				if (b.width > x && b.width < x+width) {
//					highlight = true;
//					return true;
//				}
//				
//				if (b.x > x && b.x < x+width) {
//					highlight = true;
//					return true;
//				}
//			}
//			
//			// Secondly, if it is between pipes and drops
//			if (b.y > top || b.height < Tester.canvas.getHeight()-bottom) {
//				if ((b.height > Tester.canvas.getHeight()-bottom) && ((b.x > x && b.x < x+width) || (b.width > x && b.width < x+width))) {
//					highlight = true;
//					return true;
//				}
//				
//				if ((b.x < top || b.width < top)  && ((b.x > x && b.x < x+width) || (b.width > x && b.width < x+width))) {
//					highlight = true;
//					return true;
//				}
//			}
//			
		//==========================================================
		
		// ============================ Third Try
		
//		if (b.y < top || b.y > Tester.canvas.getHeight()-bottom) {
//			if (( b.x > x && b.x < x + width ) || (b.width > x && b.width < x + width)) {
//				highlight = true;
//				return true;
//			}
//			
//		}
//		
		
		// ======================================
		
		highlight = false;
		return false;
	}
	
	public boolean goesThrough(Bird b) {
		
		if (b.y < top || b.y > Tester.canvas.getHeight()-bottom) {
			if (highlight = false)
				count++;
			return true;
		}
		//System.out.println(count);
		return true;
	}
	
	public void update() {
		x -= speed;
	}
	
}
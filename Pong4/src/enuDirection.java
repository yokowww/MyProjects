
public enum enuDirection {
	VERTICAL	(false, true),
	HORIZONTAL	(true, false);
	
	private boolean moveX, moveY;
	
	private enuDirection(boolean moveX, boolean moveY) {
		this.moveX = moveX;
		this.moveY = moveY;
	}
	
	public boolean isMoveX() {	return moveX;	}
	public boolean isMoveY() {	return moveY;	}
	
	
}
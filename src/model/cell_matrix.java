package model;

public class cell_matrix {
	
	//values
	private String snake;
	private String stairs;
	private player p;
	private int pos;
	
	public cell_matrix(int pos) {
		this.pos = pos;
	}
	
	
	//links
	private cell_matrix next;
	private cell_matrix prev;
	private cell_matrix up;
	private cell_matrix down;
	
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	/**
	 * @param next
	 * @param prev
	 * @param snake
	 * @param stairs
	 * @param p
	 */
	public cell_matrix( String snake, String stairs, player p) {
		super();
		
		this.snake = snake;
		this.stairs = stairs;
		this.p = p;
	}
	public cell_matrix getNext() {
		return next;
	}
	public void setNext(cell_matrix next) {
		this.next = next;
	}
	public cell_matrix getPrev() {
		return prev;
	}
	public void setPrev(cell_matrix prev) {
		this.prev = prev;
	}
	public String getSnake() {
		return snake;
	}
	public void setSnake(String snake) {
		this.snake = snake;
	}
	public String getStairs() {
		return stairs;
	}
	public void setStairs(String stairs) {
		this.stairs = stairs;
	}
	public player getP() {
		return p;
	}
	public void setP(player p) {
		this.p = p;
	}
	public cell_matrix getUp() {
		return up;
	}
	public void setUp(cell_matrix up) {
		this.up = up;
	}
	public cell_matrix getDown() {
		return down;
	}
	public void setDown(cell_matrix down) {
		this.down = down;
	}
	
	@Override
	public String toString() {
		return " ["+pos+" "  + snake + " " + stairs + " " + p + "]";
	}
	
	
	
	
	
	

}

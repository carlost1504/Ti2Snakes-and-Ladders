package model;

public class TableOfGame {

	private cell_matrix origin;

	public TableOfGame(int rows, int columns) {
		origin = createRow(columns);
		
		cell_matrix currentRow = origin;
		for(int i=1 ; i<rows ; i++) {
			cell_matrix newrow = createRow(columns);
			connectRow(currentRow, newrow);
			currentRow = newrow;
		}
		
	}
	
	public void connectRow(cell_matrix filaA, cell_matrix filaB) {
		cell_matrix currentA = filaA;
		cell_matrix currentB = filaB;
		
		while(currentA.getNext() != null) {
			currentA.setDown(currentB);
			currentB.setUp(currentA);
			
			currentA = currentA.getNext();
			currentB = currentB.getNext();
		}
	}
	
	public cell_matrix createRow(int columns) {
		cell_matrix first = new cell_matrix(0);
		cell_matrix current = first;
		for(int i=1 ; i<columns ; i++) {
			cell_matrix right = new cell_matrix(i);
			current.setNext(right);
			right.setPrev(current);
			current = current.getNext();
		}
		
		return first;
	}
	
	public void printBoard() {
		cell_matrix currentRow = origin;
		printRow(currentRow);
		
		while(currentRow.getDown() != null) {
			currentRow = currentRow.getDown();
			printRow(currentRow);
		}
		
	}
	
	public void printRow(cell_matrix row) {
		cell_matrix current = row;
		System.out.print(current.getPos() + " ");
		while(current.getNext() != null) {
			current = current.getNext();
			System.out.print(current.getPos()+ " ");
		}
		System.out.println();
	}
	
}

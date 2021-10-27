package model;

public class TableOfGame {

	private cell_matrix first;
	private cell_matrix last;
	private long num_cell;
	
	public void insertFirst(cell_matrix nodee) {
		if(first ==null) {
			first =nodee;
			last =nodee;
		}else {
			cell_matrix second=first;
			first =nodee;
			first.setNext(second);
			second.setPrev(first);
		}
	}
	
	public void insertLast(cell_matrix nodee) {
		if(last ==null) {
			first =nodee;
			last =nodee;
		}else {
			cell_matrix beforelast=last;
			last =nodee;
			beforelast.setNext(last);
			last.setPrev(beforelast);
		}
	}
	
	public void printLinst(cell_matrix current) {
		//current=first;
		if(current.getNext()!= null) {
			System.out.println(current.getPerson().getNombre()+" "+current.getPerson().getEdad());
			current=current.getNext();
			printLinst(current);
		}else
			System.out.println(last.getPerson().getNombre()+" "+last.getPerson().getEdad());
	}
	
	
	
	

	
}

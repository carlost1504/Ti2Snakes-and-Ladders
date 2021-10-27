package ui;

import java.util.Scanner;

public class Main {
	
	private Scanner in;
	
	
	
	public static void main(String...args) {
		
		System.out.println("**************************");
		System.out.println("**Snake and  Ladders Inc**");
		System.out.println("**************************");
		
		
	}
	
	public Main() {
		in = new Scanner(System.in);
	}
	
	public int showMenu() {
		System.out.println("Elegir una opcion: ");
		System.out.println("1. Jugar\n 2.Puntajes \n 3. Salir");
		int optionAsnwer = Integer.parseInt(in.nextLine());
		return optionAsnwer;
	}
	
	public void recursive() {
		
	}
	
	public void showGame() {
		
	}
	
}

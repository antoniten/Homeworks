package Homeworks;

import java.util.Scanner;


public class FVyvod {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Vveditye 'draw' esli hotitye narisovat figuru,ili vveditye 'delete' esli hotitye udalit figuru");
		String logoper = in.nextLine() ;  
		FFigure figure1 = new FOval();
		FFigure figure2 = new FKrug();
		if(logoper.equals("draw")){
		figure1.draw();
		figure2.draw();
		} else if (logoper.equals("delete")){
			figure1.erase();
			figure2.erase();
		}
	}
}

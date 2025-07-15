package cat_project;

import java.util.Scanner;

public class Gato {
	
	
public static void main ( String [] args) {
	Scanner esc = new Scanner(System.in);
	
	String gatosx = "";
	boolean escrever = true;
	String gatos = "gatos";
	String gatos2 = "GATO";
	String gatos3 = "gatinho";
	String gatos4 = "gatoG";
	System.out.println("escreva GATO, gatos, gatinho ou gatoG");
	
	while(escrever = true) {
		gatosx = esc.next();
		
		if(gatosx.equals(gatos)) {	
			
			System.out.println("  /\\          /\\");
			System.out.println(" /  \\________/  \\ ");
			System.out.println("/                \\  ");
			System.out.println("(  /\\         /\\  )");
			System.out.println("====      V      ==== ");
			System.out.println("====== (__|__)  ======");
			
			
			System.out.println("  /\\          /\\");
			System.out.println(" /  \\________/  \\ ");
			System.out.println("/                \\  ");
			System.out.println("(  /\\         /\\  )");
			System.out.println("====      V      ==== ");
			System.out.println("====== (__|__)  ======");
			
		} 
		else if(gatosx.equals(gatos2)) {
			 
			System.out.println("  /\\_____/\\  ");
		        System.out.println(" /  o   o  \\ ");
		        System.out.println("( ==  ^  == )");
		        System.out.println(" )         ( ");
		        System.out.println(" /   | |   \\ ");
		        System.out.println("/    |_|    \\");
		      
		}
		else if(gatosx.equals(gatos3)) {
			 
			System.out.println("   /\\_/\\  ");
		        System.out.println("  ( o.o ) ");
		        System.out.println("   > ^ <  ");
		       
		} 
		else if (gatosx.equals(gatos4)) {
		System.out.println("   /\\_____/\\");
	        System.out.println("  /  o   o  \\");
	        System.out.println(" /     ^     \\");
	        System.out.println("(   (---)    )");
	        System.out.println(" \\   ~~~    /");
	        System.out.println("  \\_______/");
	        System.out.println("    /   \\ ");
	        System.out.println("   (     )");
	        System.out.println("    \\___/");
		}
		
		
		else {
			System.out.println("No gato");
		}
		
		
		if (gatosx.equals("Sair")) {
			escrever = false;
		}
	}

	esc.close();
}

}

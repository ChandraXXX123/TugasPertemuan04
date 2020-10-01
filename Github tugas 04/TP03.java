package org.d3ifcool.ima04;
import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini//
		Scanner cmd = new Scanner(System.in);
		String nama1 = "Dira";
		String nama2 = "Radi";
		String nama3 = "Idar";
		int bilangan1 = cmd.nextInt();
		int bilangan2 = cmd.nextInt();
		int bilangan3 = cmd.nextInt();
		
		if((bilangan1 > bilangan2) && (bilangan2 > bilangan3)){
			System.out.println(nama1);
		}
		else if((bilangan1 > bilangan3) && (bilangan3 > bilangan2)){
			System.out.println(nama1);
		}
		else if((bilangan2 > bilangan1) && (bilangan1 > bilangan3)){
			System.out.println(nama2);
		}
		else if((bilangan2 > bilangan3) && (bilangan3 > bilangan1)){
			System.out.println(nama2);
		}
		else if((bilangan3 > bilangan1) && (bilangan1 > bilangan2)){
			System.out.println(nama3);
		}
		else{
			System.out.println(nama3);
		}
	}
}	

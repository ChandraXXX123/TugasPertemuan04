package org.d3ifcool.ima04;
import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini //
				Scanner cmd = new Scanner(System.in);
		int jumlahTelur = cmd.nextInt();
		if ((jumlahTelur >= 12) && (jumlahTelur <= 23)){
			int harga10 = jumlahTelur * 800;
			int diskon10 = harga10 / 10;
			int hasil10 =  harga10 - diskon10;
			System.out.println("Telur "+jumlahTelur+" x 800 = "+harga10);
			System.out.println("Diskon 10% = "+diskon10);
			System.out.println("Total dibayar = "+hasil10);
		}
		else if (jumlahTelur >= 24){
			int harga15 = jumlahTelur * 800;
			int diskon15 = harga15 * 3 / 20;
			int hasil15 =  harga15 - diskon15;
			System.out.println("Telur "+jumlahTelur+" x 800 = "+harga15);
			System.out.println("Diskon 15% = "+diskon15);
			System.out.println("Total dibayar = "+hasil15);
		}
		else {
			int harga0 = jumlahTelur * 800;
			int diskon0 = harga0 * 0;
			int hasil0 =  harga0 - diskon0;
			System.out.println("Telur "+jumlahTelur+" x 800 = "+harga0);
			System.out.println("Diskon 0% = "+diskon0);
			System.out.println("Total dibayar = "+hasil0);
		}
	}
}

package org.d3ifcool.ima04;
import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner cmd = new Scanner(System.in);
		String name1 = "Dira", name2 = "Radi", name3 = "Idar";
		int nilai = 100, nilaiDira, nilaiRadi, nilaiIdar;
		
		nilaiDira = cmd.nextInt();
		nilaiRadi = cmd.nextInt();
		nilaiIdar = cmd.nextInt();
		
		String nilaiTertinggi, nilaiKedua, nilaiTerkecil;
		
		if((nilaiDira > nilaiRadi) && (nilaiRadi > nilaiIdar)){
			nilaiTertinggi = name1;
			nilaiKedua = name2;
			nilaiTerkecil = name3;
		}
		else if((nilaiRadi > nilaiDira) && (nilaiDira > nilaiIdar)){
			nilaiTertinggi = name2;
			nilaiKedua = name1;
			nilaiTerkecil = name3;
		}
		else if((nilaiIdar > nilaiDira) && (nilaiDira > nilaiRadi)){
			nilaiTertinggi = name3;
			nilaiKedua = name1;
			nilaiTerkecil = name2; 
		}
		else if((nilaiIdar > nilaiRadi) && (nilaiRadi > nilaiDira)){
			nilaiTertinggi = name3;
			nilaiKedua = name2;
			nilaiTerkecil = name1;
		}
		else if((nilaiRadi > nilaiIdar) && (nilaiIdar > nilaiDira)){
			nilaiTertinggi = name2;
			nilaiKedua = name3;
			nilaiTerkecil = name1;
		}
		else{
			nilaiTertinggi = name1;
			nilaiKedua = name3;
			nilaiTerkecil = name2;
		}
		System.out.println(nilaiTerkecil+", " + nilaiKedua + ", " + nilaiTertinggi);
		

	}
}

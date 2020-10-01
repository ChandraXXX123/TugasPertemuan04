package org.d3ifcool.ima04;
import java.util.Scanner;
public class Jurnal02 {
	public static void main(final String[] args) {
		// kerjakan soal disini
        Scanner cmd = new Scanner(System.in);
        int penghasilan = cmd.nextInt();
        int penghasilanJuta = penghasilan * 1000000;

        if (penghasilan >= 501){
            int nilaiPajak30 = penghasilanJuta * 3 / 10;
            int penghasilanBersih30 = penghasilanJuta - nilaiPajak30;
            System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah");
            System.out.println("Pajak 30% = Rp. "+nilaiPajak30);
            System.out.println("Penghasilan bersih = Rp. "+penghasilanBersih30);
        }
        else if (penghasilan >= 251){
            int nilaiPajak25 = penghasilanJuta / 4;
            int penghasilanBersih25 = penghasilanJuta - nilaiPajak25;
            System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah");
            System.out.println("Pajak 25% = Rp. "+nilaiPajak25);
            System.out.println("Penghasilan bersih = Rp. "+penghasilanBersih25);
        }
        else if (penghasilan >= 51){
            int nilaiPajak15 = penghasilanJuta * 3 / 20;
            int penghasilanBersih15 = penghasilanJuta - nilaiPajak15;
            System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah");
            System.out.println("Pajak 15% = Rp. "+nilaiPajak15);
            System.out.println("Penghasilan bersih = Rp. "+penghasilanBersih15);
        }
        else {
            int nilaiPajak5 = penghasilanJuta / 20;
            int penghasilanBersih5 = penghasilanJuta - nilaiPajak5;
            System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah");
            System.out.println("Pajak 5% = Rp. "+nilaiPajak5);
            System.out.println("Penghasilan bersih = Rp. "+penghasilanBersih5);
        }
    }
}

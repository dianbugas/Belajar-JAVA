/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.latihan.aritmatika;
import java.util.Scanner;
/**
 *
 * @author dian
 */
public class LatihanAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
        
        //latihan lain
        int a,b,c;
        System.out.println("PERKALIAN");
        System.out.print("Inputkan Angka Pertama = ");
        a = userInput.nextInt();
        System.out.print("Input Angka Kedua = ");
        b = userInput.nextInt();
        c = a*b;
        System.out.print("Hasil" + a + "x" + b + "=" + c);
    }
    
}

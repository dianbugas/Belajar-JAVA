/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_operatoraritmatika;

/**
 *
 * @author dian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Operasi aritmatika
            int var1 = 11;
            int var2 = 5;
            
            int hasil;
            //penjumlahan
            hasil=var1+var2;
            System.out.println(var1 +"+"+ var2+"="+ hasil);
            
            //pengurangan
            hasil = var1-var2;
            System.out.printf("%d-%d=%d \n", var1,var2,hasil);
            
            //perkalian
            hasil = var1*var2;
            System.out.printf("%d-%d=%d \n", var1,var2,hasil);
            
            //pembagian
            hasil = var1/var2;
            System.out.printf("%d-%d=%d \n", var1,var2,hasil);
            
            
            float a =5;
            float b =6;
            float hasilnya = a/b;
            System.out.println(a+"+"+b+ "="+hasilnya);
            
            //modulus
            hasil = var1%var2;
            System.out.printf("%d %% %d=%d \n", var1,var2,hasil);
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_konversitipedata;

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
        //konversi data
        int nilaiInt = 14; //32 bit
        System.out.println("nilai INT :" + nilaiInt);
        
        //memperluas rentang ke tipe data yg lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai Long:" + nilaiLong);
        
        //memperkecil rentang ke tipe data yg lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai Type :" + nilaiByte);
        System.out.println("nilai max byte : "+ Byte.MAX_VALUE);
        System.out.println("nilai min byte : "+ Byte.MIN_VALUE);
        System.out.println("nilai min long : "+ Long.MIN_VALUE);
        
        // JIKA KITA memberikan angka di luar target maka angkanya akan error
        /*urtutan tipe data
        byte
        sourt 
        int 
        long
        */
        
        //casting pembagian
        int a =10;
        float b = 6;
        float c = a/b;
        System.out.printf("%d / %f = %f", a,b,c);
        
        int x =10;
        int y = 4;
        
        float z =(float)x/y;
        System.out.printf("%d / %d= %f \n",x,y,z);
        
        byte r =10;
        byte d = 4;
        
        int t = r/d;
        System.out.printf("%d / %d= %d \n",r,d,t);
    }
    
}

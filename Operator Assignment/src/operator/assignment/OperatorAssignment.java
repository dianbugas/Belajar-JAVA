/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.assignment;

/**
 *
 * @author dian
 */
public class OperatorAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operator assignment
        int x = 2; int z = 4; int y;
        y=x*z;
        System.out.println("nilai y" + y);
        
        
        // Assignment operator jumlah
        int a = 1;
        a += 10; // a = a + 10;
        System.out.println("nilai a = " + a);

        // Assignment operator pengurangan
        int b = 100;
        b -= 25;
        System.out.println("nilai b = " + b);

        // Assignment operator perkalian
        int c = 100;
        c *= 20;
        System.out.println("nilai c = " + c);

        // Assignment operator pembagian
        int d = 100;
        d /= 20;
        System.out.println("nilai d = " + d);

        // Assignment operator modulus
        int e = 10;
        e %= 7;
        System.out.println("nilai e = " + e);
    }
    
}

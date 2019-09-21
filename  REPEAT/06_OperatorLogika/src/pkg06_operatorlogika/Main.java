/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_operatorlogika;

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
        //dilakukan di tipedata bolean
        //OR,AND,XOR,Negasi
        boolean a,b,c;
        //OR/ atau (||)
        System.out.println("=====OR || ======");
        a=true;
        b=true;
        c=(a||b);
        System.out.println(a + "||" + b +"="+c);
        
        a=false;
        b=true;
        c=(a||b);
        System.out.println(a + "||" + b +"="+c);
        
        a=true;
        b=false;
        c=(a||b);
        System.out.println(a + "||" + b +"="+c);
        
        a=false;
        b=false;
        c=(a||b);
        System.out.println(a + "||" + b +"="+c);
        
        //AND/ dan (||)
        System.out.println("=====AND && ======");
        a=true;
        b=true;
        c=(a&&b);
        System.out.println(a + "&&" + b +"="+c);
        
        a=false;
        b=true;
        c=(a&&b);
        System.out.println(a + "&&" + b +"="+c);
        
        a=true;
        b=false;
        c=(a&&b);
        System.out.println(a + "&&" + b +"="+c);
        
        a=false;
        b=false;
        c=(a&&b);
        System.out.println(a + "&&" + b +"="+c);
     
        //XOR/ dan (^)
        System.out.println("=====XOR ^ ======");
        a=true;
        b=true;
        c=(a^b);
        System.out.println(a + "^" + b +"="+c);
        
        a=false;
        b=true;
        c=(a^b);
        System.out.println(a + "^" + b +"="+c);
        
        a=true;
        b=false;
        c=(a^b);
        System.out.println(a + "^" + b +"="+c);
        
        a=false;
        b=false;
        c=(a^b);
        System.out.println(a + "^" + b +"="+c);
        
        //not /negasi ->>slipping (!)
        System.out.println("====negasi (!) ====");
        a=true;
        c = !a;
        System.out.println(a+"--> ! ="+c);
        a=false;
        c = !a;
        System.out.println(a+"--> ! ="+c);
        
    }
}

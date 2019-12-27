package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

            //operator pada bitwise
            byte a=3;
            byte b;
            byte c;

            String a_bits, b_bits, c_bits;
            //operator shift left
            System.out.println("======shift left (<<)");
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            b = (byte)(a<<3);
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);

            //operator shift right
            System.out.println("======shift reght (>>)");
            a=24;
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            b = (byte)(a>>2);
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);

            //operator bitwise or
            System.out.println("======== bitwise or (|) ");
            a= 24;
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            b = 12;
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);
            System.out.println("=============or");
            c = (byte)(a | b);
            c_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", c_bits, c);

            //operator bitwise and
            System.out.println("======== bitwise and (&) ");
            a= 24;
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            b = 12;
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);
            System.out.println("=============and");
            c = (byte)(a & b);
            c_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", c_bits, c);

            //operator bitwise xor
            System.out.println("======== bitwise xor (^) ");
            a= 24;
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            b = 12;
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);
            System.out.println("=============xor");
            c = (byte)(a ^ b);
            c_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", c_bits, c);

            //operator bitwise and
            System.out.println("======== bitwise and (&) ");
            a= 24;
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            b = 12;
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);
            System.out.println("=============and");
            c = (byte)(a & b);
            c_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", c_bits, c);

            //operator negasi /not
            System.out.println("=============bitwise not (~)");
            a = 24;
            b = (byte) (~a);
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);
            System.out.println("=============not");
            b_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", b_bits, b);




    }
}

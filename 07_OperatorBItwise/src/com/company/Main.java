package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

            //operator pada bitwise
            byte a=3;
            byte b;
            String a_bits, b_bits;
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



    }
}

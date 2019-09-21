package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

            //operator pada bitwise
            byte a=3;
            byte b;
            String a_bits, b_bits;
            a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s=%d \n", a_bits, a);


    }
}

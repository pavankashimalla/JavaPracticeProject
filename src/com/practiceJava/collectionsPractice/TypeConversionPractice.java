package com.practiceJava.collectionsPractice;

public class TypeConversionPractice {
    public static void main(String[] args){
        byte b = 127;
        short s = 2789;
        int i = 6793213;
        long l = 9863519980l;
        double d = 468023899.82939d;
        float f = 980.678f;
        char c = 'A' ;
        boolean bool = true;

        l = (byte) b + (short) s / (char) c ;
        System.out.println(l) ;



    }
}

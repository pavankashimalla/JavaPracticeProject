package com.practiceJava;

 class AllOperations {
    public int addNumbers(){

        Integer a = 110;
        Integer b = 253;
        Integer c = a + b;
        return c;
    }
    public float subtract(){
        float a = 198;
        float b = 543;
        float c = a - b;
        return c;
    }
    public long divison(){
        long a = 98453765399l;
        long b = 65439987492l;
        long c = a / b;
        return c;
    }
    public void multiplication(){
     int a = 34;
     int b = 55;
     System.out.println(a * b);

    }

    public static void main (String[] args){
        AllOperations object = new AllOperations();
        Integer result = object.addNumbers();
        float result1 = object.subtract();
        long result2 = object.divison();
        object.multiplication();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}

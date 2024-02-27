package com.practiceJava;

public class OperationsInput {
    public int addNumbers(int a , int b , int c ){
    int d = a + b + c;
    return d;
    }
    public long subtraction(long a , long b , long c , long d ){
    long e = a - b - c - d;
    return e;
    }
    public float division(float a , float b){
        float c = a / b ;
        return c;
    }
    public double multiplication(double a , double b , double c){
        double d = a * b * c;
        return d;
    }
    public static void main(String[] args){
        OperationsInput object = new OperationsInput();
        int result = object.addNumbers(36 , 95 , 20);
        System.out.println(result);
        long result1 = object.subtraction(8754398220978l , 967641190323l , 99493291847981l , 824433411190l);
        System.out.println(result1);
        float result2 = object.division(964.8528f ,3859.98237f );
        System.out.println(result2);
        double result3 = object.multiplication(987643.87659123 , 456723.483698 , 967545.0975423);
        System.out.println(result3);
    }


}

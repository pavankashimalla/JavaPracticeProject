package com.practiceJava;



public class StringMethods {
    public void myStringArray(){
        String myString = "Java n  Is A Objectn,Oriented Program nn ";
        String myString2 = "        hello world 2521                   ";

        // charAtIndex(myString);                                    char
      // intLength(myString);                                        int
       // endsWith(myString);                                       boolean
       // contains(myString);                                       boolean
       // equalsIgnore(myString , myString2);                       boolean
      //  equals(myString , myString2);                             boolean
       //  indexOf(myString);                                //        int
      //  hashCode(myString2);                                       int
      //  empty(myString);                                          boolean
        lastIndexOf(myString);                                //     int
       // replace(myString);                                        //String
       // replaceFirst(myString);                                //   String
       // split(myString);                                          String[]
       // subString(myString);                                      String
      //  toCharArray(myString);                                  //  char[]
       // toLowerCase(myString);                                    String
       // toUpperCase(myString);                                    String
       // trim(myString2);                                          String
    }
    public void charAtIndex(String myString){

        char result = myString.charAt(0);
        System.out.println(result);
    }
    public void intLength(String myString){
        int result = myString.length();
        System.out.println(result);
    }
    public void endsWith(String myString){
        boolean result = myString.endsWith("mom");
        System.out.println(result);
    }
    public void contains(String myString){
        boolean result = myString.contains("d");
        System.out.println(result);
    }
    public void equalsIgnore(String myString , String myString2){
        boolean result = myString.equalsIgnoreCase(myString2);
        System.out.println(result);
    }
    public void equals(String myString , String myString2){
        boolean result = myString.equals(myString2);
        System.out.println(result);
    }
    public void indexOf(String myString){
        int result = myString.indexOf("n");
        System.out.println(result);
    }
    public void hashCode(String myString2){
        int result = myString2.hashCode();
        System.out.println(result);
    }
    public void empty(String myString){
        boolean result = myString.isEmpty();
        System.out.println(result);
    }
    public void lastIndexOf(String myString){
        int result = myString.lastIndexOf("n");
        System.out.println(result);
    }
    public void replace(String myString){
        String result = myString.replace("O" , "world");
        System.out.println(result);
    }
    public void replaceFirst(String myString){
        String result = myString.replaceFirst("O" , "fu");
        System.out.println(result);
    }
    public void subString(String myString){
        String result = myString.substring(6 , 20);
        System.out.println(result);

    }
    public void split(String myString){
    String[] result = myString.split(",");
    for (int i = 0 ; i < result.length ; i++){
        System.out.println(result[i]);
    }
    }
    public void toCharArray(String myString){
    char[] result = myString.toCharArray();
   for (int i = 0 ; i < result.length ; i++){
    System.out.println(result[i]);
   }
    }

    public void toLowerCase(String myString){
        String result = myString.toLowerCase();
        System.out.println(result);
    }
    public void toUpperCase(String myString){
        String result = myString.toUpperCase();
        System.out.println(result);
    }

    public void trim(String myString2){

        System.out.println(myString2.trim());
    }

    public static void main(String[] args){
        StringMethods object = new StringMethods();
        object.myStringArray();
    }


}

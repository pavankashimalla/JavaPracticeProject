package com.practiceJava;

public class StringPractice {

    public void myMainMethod(){
      // String myString = "Praveen,Naveen,Prem,Pavan,Kanni";
       // String separator = ",";

       // splitReplaceMethod(myString , separator);
       // changingString(myString , separator);
      //  String myString = "aaa bbb ccc ddd eee fff";

       // subStringPractice(myString);

        String[] givenString = new String[]{"java","madam","level","devil","aabaa"};
      //  String separator = ",";
       // charReverse(givenString);
      //  isStringPalindrome(givenString);
      //  stringSplit(givenString ,separator );
      //  stringArrayPalindrome(givenString);
      // creatingPalindromeArrays(givenString);
       reverseCreatingPalindromes(givenString);
       // creatingNewArraySize(givenString);
       // stringPalindromePractice(givenString);


    }
    public void creatingNewArraySize(String[] givenString){

        int arraySize = givenString.length;

        int[] newArrayLength = new int[arraySize];
        int counter = 0;

        for (int i = 0 ; i < givenString.length ; i ++){
        String variable = givenString[i];
        int stringSize = variable.length();
        newArrayLength[counter] = stringSize;
        counter++;
        }
        for (int i = 0 ; i < newArrayLength.length ; i++){
            System.out.println(newArrayLength[i]);
        }
    }




    public void reverseCreatingPalindromes(String[] myString){

        int arraySize = myString.length;

        String[] palindromeArray = new String[arraySize];
       int palindromeCounter = arraySize - 1;

       String[] nonPalindromeArray = new String[arraySize];
       int nonPalindromeCounter = arraySize - 1;

       for (int i = 0 ; i < myString.length ; i++){
           String stringVariable = myString[i];

          boolean isPalindrome = stringPalindrome(stringVariable);

           if (isPalindrome){
               palindromeArray[palindromeCounter] = stringVariable;
               palindromeCounter--;
           }else {
               nonPalindromeArray[nonPalindromeCounter] = stringVariable;
               nonPalindromeCounter--;
           }
       }
    }



    public void stringSplit (String givenString , String separator){
        String[] afterSplit = givenString.split(separator);
        for (int i = 0 ; i < afterSplit.length ; i++){
            System.out.println(afterSplit[i]);
        }


    }
    public void charReverse(String givenString){
        String emptyVariable = "";
        int stringSize = givenString.length();
        int lastIndex = stringSize - 1;

        for (int i = lastIndex ; i >= 0 ; i--){
            char character = givenString.charAt(i);
             emptyVariable =  emptyVariable + character;

        }
        System.out.println(emptyVariable);
    }



    public void stringArrayPalindrome(String[] myString){
        for (int i = 0; i < myString.length ; i++){
           String stringVariable =  myString[i];

           String emptyVariable = "";
            int stringSize = stringVariable.length();
            int lastIndexOf = stringSize - 1 ;
            for (int j = lastIndexOf ; j >= 0  ;j-- ){
                char character = stringVariable.charAt(j);
              emptyVariable = emptyVariable + character;
            }if (emptyVariable.equals(stringVariable)){
                System.out.println(" The " + emptyVariable + " string is palindrome " );
            }else {
                System.out.println("This is not palindrome");
            }
        }
    }

    public void creatingPalindromeArrays(String[] givenstring){

        int arraySize = givenstring.length ;

        String[] palindromeArray = new String[arraySize];
        int palindromeArrayCounter = 0;

        String[] nonPalindromeArray = new String[arraySize];
        int nonPalindromeArrayCounter = 0;

        for (int i = 0 ; i < givenstring.length ; i++){
            String stringVariable = givenstring[i];

            String emptyVariable = "";
            int stringSize = stringVariable.length();
            int lastIndex = stringSize - 1 ;
            for (int j = lastIndex ; j >= 0 ; j--){
                char character = stringVariable.charAt(j);
                emptyVariable = emptyVariable + character;

            }if (emptyVariable.equals(stringVariable)){
                palindromeArray[palindromeArrayCounter] = emptyVariable;
                palindromeArrayCounter++;

            }else {
                nonPalindromeArray[nonPalindromeArrayCounter] = emptyVariable;
                nonPalindromeArrayCounter++;
            }
        }

    }

    public void stringPalindromePractice(String[] myString){

        int arraySize = myString.length;

        String[] palindromeArray = new String[arraySize];
        int palindromeArrayCounter = 0;

       String[] nonPalindrome = new String[arraySize];
       int nonPalindromeCounter = 0;

        for (int i = 0 ; i < myString.length ; i++){
          String stringVariable = myString[i];

         boolean isPalindrome = stringPalindrome(stringVariable);
            if (isPalindrome){
              palindromeArray[palindromeArrayCounter]  = stringVariable;
              palindromeArrayCounter++;
            }else {
              nonPalindrome[nonPalindromeCounter] = stringVariable;
              nonPalindromeCounter++;
            }
        }
    }

    public void stringReverse(String myString){



    }


    public boolean stringPalindrome(String givenString){
        String emptyVariable = "";

        int stringSize = givenString.length();
        int lastIndexOf = stringSize - 1;
        for (int i = lastIndexOf ; i >= 0 ; i--){
            char character = givenString.charAt(i);
            emptyVariable = emptyVariable + character;
        }
        if (emptyVariable.equals(givenString)){
            return true;
        }else {
           return false;
        }
    }


    public void isStringPalindrome(String myString){

        String emptyVariable = "";

        int stringSize = myString.length();
        int lastIndexOf = stringSize - 1;
        for (int i = lastIndexOf ; i >= 0 ; i--){
            char character = myString.charAt(i);
            emptyVariable = emptyVariable + character;
        }
        if (emptyVariable.equals(myString)){
            System.out.println(" The " + emptyVariable + " string is palindrome " );
        }else {
            System.out.println("The string is not palindrome");
        }
    }
    public void subStringPractice( String myString){
       /* int startingIndex = myString.indexOf("a");
        int endingIndex = myString.lastIndexOf("a");
       String result =myString.substring(startingIndex , endingIndex + 1);
       System.out.println(result);

        int startingIndexB = myString.indexOf("b");
        int endingIndexB = myString.lastIndexOf("b");
        String resultB = myString.substring(startingIndexB , endingIndexB + 1);
        System.out.println(resultB);

        int startingIndexC = myString.indexOf("c");
        int endingIndexC = myString.lastIndexOf("c");
        String resultC = myString.substring(startingIndexC , endingIndexC + 1);
        System.out.println(resultC);

        int startingIndexD = myString.indexOf("d");
        int endingIndexD = myString.lastIndexOf("d");
        String resultD = myString.substring(startingIndexD , endingIndexD + 1);
        System.out.println(resultD);

        int startingIndexE = myString.indexOf("e");
        int endingIndexE = myString.lastIndexOf("e");
        String resultE = myString.substring(startingIndexE , endingIndexE + 1);
        System.out.println(resultE);

        int startingIndexF = myString.indexOf("f");
        int endingIndexF = myString.lastIndexOf("f");
        String resultF = myString.substring(startingIndexF , endingIndexF + 1);
        System.out.println(resultF);*/


        String[] subStringArray = new String[]{"a","b","c","d","e"};

        subStringInLoop(myString , subStringArray);

        /*subStringMethod(myString , "a");
        subStringMethod(myString , "b");
        subStringMethod(myString , "c");
        subStringMethod(myString , "d");
        subStringMethod(myString , "e");*/





    }

    public void subStringMethod(String myString , String subString){
        int startingIndex = myString.indexOf(subString);
        int endingIndex = myString.lastIndexOf(subString);
        String result = myString.substring(startingIndex , endingIndex + 1);
        System.out.println(result);


    }

    public void subStringInLoop(String myString , String[] subStringArray){

        for (int i = 0 ; i < subStringArray.length ; i++){
            int startingIndex = myString.indexOf(subStringArray[i]);
            int endingIndex = myString.lastIndexOf(subStringArray[i]);
            String result = myString.substring(startingIndex , endingIndex + 1);
            System.out.println(result);

        }

    }


    public void splitReplaceMethod(String myString , String separator){
        String[] namesArray = myString.split(separator);
        for (int i = 0 ; i < namesArray.length ; i++){
            String name = namesArray[i];

          String nameAfterReplace = name.replace("n" , "z");

           namesArray[i] = nameAfterReplace ;


        System.out.println(namesArray[i]);
        }
    }
    public void changingString(String myString , String separator){
        String[] namesArray = myString.split(separator);
       for (int i = 0 ; i < namesArray.length ; i++){
           String name = namesArray[i];
         int indexOfGivenNumber = name.indexOf("ee");
         if (indexOfGivenNumber > 0){
             System.out.println("The name " + name + " has 'ee' ");
         }else {
             System.out.println("The name " + name + " doesn't have 'ee' "  );
         }

       }

    }



    public static void main(String[] args){
        StringPractice object = new StringPractice();
        object.myMainMethod();
    }

}

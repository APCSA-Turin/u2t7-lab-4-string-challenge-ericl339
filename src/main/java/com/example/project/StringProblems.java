package com.example.project;
public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            //implement code here
        int amount = x.length();
        if (amount < 2) {
            return false;
        }
        amount -= 2;
        String lastTwo = x.substring(amount);
        if (lastTwo.equals("ly")) {
            return true;
        }
        return false;
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        if (s2.equals("")) {
            return s1;
        }
        if (s1.equals("")) {
            return s2;
        }
        String firstLetter = s2.substring(0, 1);
        int amount = s1.length();
        amount -= 1;
        String lastLetter = s1.substring(amount);

        if (firstLetter.equals(lastLetter)) {
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abeep") -> "abeep"
    public String deFront(String s1){
        //implement code here
        String body = s1.substring(2);
        String firstLetter = s1.substring(0, 1);
        String secondLetter = s1.substring(1, 2);
        String whole = "";
        if (firstLetter.equals("a")) {
            whole += "a";
        }
        if (secondLetter.equals("b")) {
            whole += "b";
        }
        whole += body;
        return whole;
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        int amount = s1.length();
        String firstLetter = s1.substring(0, 1);
        String lastLetter = s1.substring(amount - 1);
        if (firstLetter.equals("x")) {
            s1 = s1.substring(1, amount);
            amount -= 1;
        }
        if (lastLetter.equals("x")) {
            s1 = s1.substring(0, amount - 1);
        }
        return s1;
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        int amount = s1.length();
        String firstLetter = s1.substring(0, 1);
        String lastLetter = s1.substring(amount - 1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        String whole = "";
        if (firstLetter.equals("f")) {
            whole += "Fizz";
        }
        if (lastLetter.equals("b")) {
            whole += "Buzz";
        }
        if (whole.equals("")) {
            return s1;
        }
        return whole;
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
        if (x % 15 == 0) {
            return "FizzBuzz!";
        }
        if (x % 5 == 0) {
            return "Buzz!";
        }
        if (x % 3 == 0) {
            return "Fizz!";
        }
        return "" + x + "!";
    }
}
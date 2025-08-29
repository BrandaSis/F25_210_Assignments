package lec03;

public class StringDemo2 {
    public static void main (String[] args){
        String s1 = "Hello";    // string literal - stored in string pool
        String s1n = new String("Hello");   // new string
        if (s1.equals(s1n))
            System.out.println("String contents are the same!");
        else
            System.out.println("String contents are NOT the same!");
        if (s1 == s1n)
            System.out.println("Strings are the same object!");
        else
            System.out.println("Strings are NOT the same object!");

        String[] sA = {"Hello", "Hello", "bye"};
        String[] sB = {new String("Hello"), "Hello", "bye"};

    }
}

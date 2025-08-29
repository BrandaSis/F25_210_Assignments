package lec03;

// https://chatgpt.com/share/67893ed2-5290-800b-a7a2-b8d2ef0c330f

public class StringReferenceTest {
    public static void main(String[] args) {
        String s1 = "Hello";                  // Interned string
        String s2 = new String("Hello");      // New String object in the heap
        String s3 = s2.intern();              // Interned version of the string

        // Compare references
        System.out.println("s1 == s2: " + (s1 == s2));         // false
        System.out.println("s1 == s3: " + (s1 == s3));         // true
        System.out.println("s2 == s3: " + (s2 == s3));         // false

        // Use identityHashCode to check memory references
        System.out.println("IdentityHashCode of s1: " + System.identityHashCode(s1));
        System.out.println("IdentityHashCode of s2: " + System.identityHashCode(s2));
        System.out.println("IdentityHashCode of s3: " + System.identityHashCode(s3));
    }
}

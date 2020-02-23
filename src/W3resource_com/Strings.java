package W3resource_com;

public class Strings {
    public static void main(String[] args) {
//        1. Write a Java program to get the character at the given index within the String.
//        Go to the editor
//
//        Sample Output:
//
//        Original String = Java Exercises!
//        The character at position 0 is J
//        The character at position 10 is i
        String str="Java Exercises!";


        System.out.println("Original String = "+str);
        System.out.println("The character at position 0 is "+str.charAt(0));
        System.out.println("The character at position 0 is "+str.charAt(10));
        System.out.println("Character(unicode point) = "+str.codePointAt(0));
        System.out.println("Character(unicode point) = "+str.codePointAt(10));


//        7. Write a Java program to concatenate a given string to the end of another string. Go to the editor
//
//        Sample Output:
//
//        String 1: PHP Exercises and
//        String 2: Python Exercises
//        The concatenated string: PHP Exercises and Python Exercises

        String str1 ="PHP Exercises and ";
        String str2="Python Exercises";
        System.out.println(str1+str2);
//        9. Write a Java program to compare a given string to the specified
//        character sequence. Go to the editor
//
//        Sample Output:
//
//        Comparing example.com and example.com: true
//        Comparing Example.com and example.com: false
        String comp1= "The quick brown fox jumps over the lazy dog";
        for (int i = 0; i < comp1.length(); i++) {
            System.out.println(comp1.charAt(i)+" ");
        }









    }
}

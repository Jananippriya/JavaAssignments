package oops.concepts.learning;

import java.util.Arrays;

/*Java Assignment
15. Write a Java program that will store the characters of string “ASSIGNMENT” in an array.
Then print that array and read it again and display the string in reverse order.
Hint: Use for loop.
 */
public class StringReversal {
    public static void main(String[] args) {
        String s = "ASSIGNMENT";
        char[] c = s.toCharArray();
        System.out.println("Character Array: "+ Arrays.toString(c));
        String reverse = "";
        for(int i = 0;i<c.length;i++){
            reverse =  c[i] + reverse;
        }
        System.out.println("Reversed string is: "+reverse);

    }
}

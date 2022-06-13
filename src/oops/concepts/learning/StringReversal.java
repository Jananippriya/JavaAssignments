package oops.concepts.learning;

import java.util.Arrays;

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

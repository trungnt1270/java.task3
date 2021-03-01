package bt.session2;

import java.util.Scanner;

public class reverseString97 {
    public static void main(String[] args) {
        String intStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String: ");
        intStr = in.next();
        inStrLen = intStr.length();

        System.out.print("The reverse is: ");
        for (int inCharIdx = inStrLen - 1; inCharIdx >= 0; --inCharIdx){
            System.out.println(intStr.charAt(inCharIdx));
        }
        System.out.println();
        in.close();
    }
}

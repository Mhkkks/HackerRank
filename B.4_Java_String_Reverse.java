/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean p = true;
        int k = A.length();
        for (int i = 0; i < k / 2; i++)

        {
            String s1 = A.substring(i, i + 1);
            String s2 = A.substring(k - 1, k);
            k--;
            if (!s1.equals(s2)) {
                p = false;
            }
        

        }
        if (p) {
            System.out.println("Yes");
        } else {
            System.out.println("No");}
        
        sc.close();
        
    }
}




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int countA=0,countB=0;
        if(a0>b0)
        {countA++;}
        else if(a0<b0)
            countB++;
             if(a1>b1)
        {countA++;}
        else if(a1<b1)
            countB++;
             if(a2>b2)
        {countA++;}
        else if(a2<b2)
            countB++;
          System.out.print(countA+" "+countB);  
    }
}

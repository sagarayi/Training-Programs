import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int a[];
        int n;
        n=s.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
            
            a[i]=s.nextInt();
        long x;
        x=sum(a,n);
        System.out.println(x);
    }
    static long sum(int a[],int n){
        long sum=0;
        for(int i=0;i<n;i++)
            sum=sum+a[i];
        return sum;
    }
}

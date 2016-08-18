import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int spaces=n-1;
        int hashes=1;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<spaces;j++)
                System.out.print(" ");
            for(int j=0;j<hashes;j++)
                System.out.print("#");
            System.out.println();
            spaces--;
            hashes++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

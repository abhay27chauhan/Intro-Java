import java.io.*;
import java.util.*;

public class reverseNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rem, bin = 0;
        while(n>0){
            rem = n%10;
            n= n/10;
            bin = bin*10 + rem;      
        }
        System.out.println(bin);
    }
}
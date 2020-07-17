import java.io.*;
import java.util.*;

public class primeTillN{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n>=2){
            System.out.print(2 + " ");
        }
        
        for(int i =3; i<=n; i++){
            boolean isPrime = true;
            for(int j = 2; j*j<=i; j++ ){
                if(i%j == 0){
                    isPrime = false; 
                    break;
                }
            }if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
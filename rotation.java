import java.util.*;

class rotation {
 static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the a number: ");
        int n = scn.nextInt();
        System.out.println("Enter the number of rotations: ");
        int r = scn.nextInt();
        int length = 0, pow = 1, bin = 0, rem;
        int n1 = n;
        while(n1>0){
            n1 = n1/10;
            length++;
        }
        r = r%length;

        if(r<0){
            r= length+r;
        }

        int r1 = r;

        while(r1>0){
            rem = n%10;
            n = n/10;

            bin  = bin + rem*pow;
            pow = pow*10;
            r1--;
        }

        length = length -r;

        while(length>0){
            bin = bin*10;
            length--;
        }
        bin = bin + n;
        System.out.println(bin);
    }
}
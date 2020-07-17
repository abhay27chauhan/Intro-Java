//swap the number with position of that number

/* number - 21453 -> 3 is on position 1 (move from right to left increasing the position)

inverse of number - 23154 -> 1 is on position 3
*/

class inverseNumber{

    public static int inverseNumber(int n){
        int inv =0;
        int op = 1;
        while(n!=0){
            int od = n%10;
            n /= 10;
            int id = op;
            int ip = od;
            
            inv = inv + id* (int)Math.pow(10, ip-1); 
            op++;
        } return inv;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt; 
        System.out.println(inverseNumber(n));
    }
}
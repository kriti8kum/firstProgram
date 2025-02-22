package NewSession;

import java.util.Scanner;

public class sumOfeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while(n > 0){
            int last = n %10;
            if(n%2==0){

                sum += last;

            }
            n/=10;
        }
        System.out.println(sum);
    }
}

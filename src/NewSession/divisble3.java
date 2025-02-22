package NewSession;

import java.util.Scanner;

// Print all the odd numbers from 1 to 100
public class divisble3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2 != 0) System.out.println(i);
        }
        for(int i = 10; i>=1;i--){
            System.out.println(i);
        }
    }
}

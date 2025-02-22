package NewSession;

import java.util.Scanner;

// Ques : -  Display this GP - 1, 2, 4, 8, 16 , 32.. upto n terms
public class GP {
   // 3 12 48 192
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1, r =2;
        for (int i = 1; i <= n; i++) {
            System.out.println(a+" ");
            a *= r;
        }
    }
}

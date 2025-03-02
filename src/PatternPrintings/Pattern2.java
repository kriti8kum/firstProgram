package PatternPrintings;

// How to print given pattern
// 1234
// 1234
// 1234
// 1234

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n  = sc.nextInt();
        for(int j = 1; j<=n; j++){
            for(int i = 1; i<=n; i++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}

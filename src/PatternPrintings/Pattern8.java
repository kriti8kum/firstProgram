package PatternPrintings;

import java.util.Scanner;

// How to print the given pattern
// 1
// A B
// 1 2 3
// A B C D something like that
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j <= i; j++){
              if(i%2!=0)  System.out.print(j + " ");
              else System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

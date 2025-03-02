package PatternPrintings;

// How to print given pattern
// 1111
// 2222 something like that
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n  = sc.nextInt();
        for(int i = 1; i<= n; i ++){
            for (int j = 1; j <=n ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

package PatternPrintings;

// Print the given pattern
// *****
// *****
// *****
// No of lines  = 3(n)
// No of stars per line  = 5 (m);
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter of numbers of rows : ");
        int m  = sc.nextInt();
        System.out.println("Enter of numbers of line : ");
        int n  = sc.nextInt();
        for(int i = 1 ; i<=m; i++){
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

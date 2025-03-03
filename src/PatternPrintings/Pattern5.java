package PatternPrintings;

// Print the given pattern
// *
// **
// *** something like that
// No of stairs in a row = i
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

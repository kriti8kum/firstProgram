package NewSession;

// WAP to print product of digits of a given number
// print the product of all non-zero digits of given
import java.util.Scanner;

public class productsOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while(n >0){
            int ld = n % 10;
            product *= ld;
            n /=10;
        }
        System.out.println(product);
    }
}

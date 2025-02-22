import java.util.Scanner;

// Ques : - Take positive integer input and tell if it is divisible by 5 and 3

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        if(n % 3 ==0&& n % 5==0){
            System.out.println("The number is divisble by 3 and 5");
        }else {
            System.out.println("This number is not divisble by 3 and 5");
        }
    }

    public static class remainder {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter dividend : ");
            int a = sc.nextInt();
            System.out.println("Enter divisor : ");
            int b = sc.nextInt();
            int q = a/b;
            int r = a-(b*q);
            System.out.println("The divisible.remainder when " + a + " dividend by " + b + " is " + r);
        }
    }
}

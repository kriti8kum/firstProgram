package Session1;

import java.util.Scanner;

public class Notdivvisble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if( n%5 ==0 || n%3 ==0){
            System.out.println("This number is divisble by only 5 not 3");
        }else {
            System.out.println("This number is divisble by 3 and 5");
        }
    }
}

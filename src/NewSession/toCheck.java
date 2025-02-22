package NewSession;

import java.util.Scanner;

public class toCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        if( n > 0){
            System.out.println("Its positive number");
        }else if (n == 0){
            System.out.println("Its number is zero");
        } else  {
            System.out.println("Its number is neagtive");
        }

        if( n % 2 == 0){
            System.out.println(n + " is Even");
        }else{
            System.out.println(n + " odd");
        }
    }
}

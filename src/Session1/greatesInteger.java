package Session1;

import java.util.Scanner;
// Take 3 positive integers input and print the greatest of them
// a,b,c
public class greatesInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a first number : ");
        int b = sc.nextInt();
        System.out.println("Enter a first number : ");
        int c = sc.nextInt();
        if( a>b && a>c){ // a is max
            System.out.println(a + " is largest");
        }
        if(b>a && b>c){ // b is max
            System.out.println(b + " is largest");
        }
        if(c>a && c>b){ // c is max
            System.out.println(c + " is largest");
        }
    }
}

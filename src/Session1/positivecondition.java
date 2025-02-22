package Session1;

import java.util.Scanner;

// Ques : - Take positive integer input and tell if it is a three-digit number or not
public class positivecondition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n  = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("this is a three digit number ");
        }else{
            System.out.println("It is not a 3 digit number ");
        }
    }
}

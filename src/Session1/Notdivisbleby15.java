package Session1;

import java.util.Scanner;

// Ques : - Take positive integer input and tell if is  divisible 5 or 3 but not divisble by 15

public class Notdivisbleby15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n %5 == 0 && n %3 ==0){
            if(n % 15 !=0){
                System.out.println("The number is divisble eby 3 or 5 but not 15");
            }else {
                System.out.println("Not matching the required conditon");
            }
        }else {
            System.out.println("Not matching the required condition");
        }
    }
}

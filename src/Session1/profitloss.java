package Session1;

import java.util.Scanner;
// Question : if cost price and selling price of an item is
// input through the keyboard, write a program to determine
// whether the seller has made profit or incurred loss. Also
// determine how much profit he made or loss he incurred.

public class profitloss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price ");
        int sp = sc.nextInt();
        if(sp<cp ){
            System.out.println("Your profit is");
            System.out.println(sp-cp);
        }
        if(sp>cp){
            System.out.println("Your loss is ");
            System.out.println(cp-sp);
        }
    }
}

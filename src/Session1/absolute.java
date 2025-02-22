package Session1;

import java.util.Scanner;
// Question print the absoulte value
public class absolute {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        if(n<0){
            n =n *(-1);
        }
        System.out.println("The absoulte value " + n);
    }
}

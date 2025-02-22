package NewSession;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(checkvar(year)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    static  boolean checkvar(int n){
        if(n % 4 == 0){
            if( n % 100 == 0){
                return n % 400 ==0;
            }
            return  true;
        }
        return  false;
    }
}

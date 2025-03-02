package NewSession;

import java.util.Scanner;

public class factorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int fact = 1;
        String se ="1";
        for(int i = 1; i<=n; i++){
            if(i>1){
                 se += " * " + i;
            }
            fact *= i;

        }
        System.out.println(se + " = " + fact);
    }
}
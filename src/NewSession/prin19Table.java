package NewSession;

import java.util.Scanner;

public class prin19Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i =19; i <=190 ; i++){
           if( i % 19 ==0) System.out.println(i);
        }
    }
}

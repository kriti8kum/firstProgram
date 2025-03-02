package NewSession;

import java.util.Scanner;

public class continues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // for(int i =1; i<100; i++){
         //   if( i==14 || i==27)continue;
           // if(i%2 ==0 || i %3==0){
             //   System.out.println(i);
            //}
        //}
        for(int i = 1; i<=100; i++){
            if(i%2==1)continue;
            System.out.println(i
            );
        }
    }
}

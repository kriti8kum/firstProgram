package NewSession;

import java.util.Scanner;

// Ques :- Display this AP - 1,3,5,7,9.... upto 'n terms
// a=4;
// d =3;
// an = 4+(n-1)3
// an = 4 + 3n -3
// an = 3n +1
 public class ArthimeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

       // for(int i=1; i<=2*n-1; i++){
         // if(i% 2 !=0) System.out.println(i+ " ");
       //}
        //for(int i =4; i <= 3*n+1; i+=3){
          //  System.out.println(i + " ");
        //}
        int a = 3, d =4;
        for(int i=1; i<=n; i++){
            System.out.println(a + " ");
            a +=d;
        }
    }
}

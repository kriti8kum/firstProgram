package NewSession;


import java.util.Scanner;

// Ques : - Permutations to arrange N person around a circular table
public class permuntations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Circular(n));
    }
    static int Circular(int n){
        int result = 1;
        while(n>0){
            result = result *n;
            n--;
        }
        return  result;
    }
}

package NewSession;
// Ques : - Prin all the even numbers
import java.util.Scanner;

public class EvenNumbersLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            if(i%2==1)System.out.println(i);
        }

    }
}

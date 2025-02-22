package NewSession;
//lets check composite or non composite
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        boolean flag = false;
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
               flag = true;
                break;
            }
        }
        if(n==1)
            System.out.println("Neither prime nor composite");
        if(flag == false)
        System.out.println("Composite number");
        else
        System.out.println("Prime number");
    }
}

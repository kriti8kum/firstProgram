import java.util.Scanner;


// Questions :- Any year is input through the keyboard. Write a
// program to determine whether the year is a leap year nor not
//(conisdering leap year occurs after every 4 years)
public class leap {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Its a leap year ");
        }else {
            System.out.println("Its not a leap year");
        }
    }
}

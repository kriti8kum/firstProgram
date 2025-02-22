package Session1;

import java.util.Scanner;

// Ques :- If the ages of Ram, Shyam and Ajay are input through
// the keyboard , write a program to determine the youngest of the three.
public class ageANme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ram Age :");
        int Ram = sc.nextInt();
        System.out.println("Enter the Shyam Age :");
        int Shyam = sc.nextInt();
        System.out.println("Enter the Ajay Age :");
        int Ajay = sc.nextInt();
        if(Ram > Shyam && Ram > Ajay){
            System.out.println(Ram + " is youngest Age");
        }  if (Shyam>Ram && Shyam>Ajay) {
            System.out.println(Shyam + " is youngest Age");
        }if(Ajay>Ram && Ajay>Shyam){
            System.out.println(Ajay + " is youngest Age");
        }
    }
}

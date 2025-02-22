package Session1;

import java.util.Scanner;

public class xaxis {
// Ques : - Given a point (x,y), write a program to find out if it
// lies on the x-axis, y-axis or at the origin , viz. (0,0)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        if(n == 0 && y ==0){
            System.out.println("This point is origin.");
        } else if (n ==0) {
            System.out.println("the point lies on y -axis");
        } else if (y ==0) {
            System.out.println("The point lies on x-axis");
        }else {
            System.out.println("The point not meet the origin");
        }
    }
}

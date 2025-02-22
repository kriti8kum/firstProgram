package Session1;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);  // Corrected formula

        if (area > perimeter) {
            System.out.println("Area is greater than the perimeter.");
        } else if (perimeter > area) {
            System.out.println("Perimeter is greater than the area.");
        } else {
            System.out.println("Perimeter and area are equal.");
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}

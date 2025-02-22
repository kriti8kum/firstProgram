package NewSession;

import java.util.Scanner;

// Program to find sum of elements in a given array
public class ArraySumOFElemets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12, 3, 4};
        int s = sum(arr, arr.length);

        System.out.println(s);
    }

    static int sum(int[] arr, int n){
        if(n <=0){
            return  0;
        }
        return  sum(arr, n-1)+ arr[n-1];
    }
}

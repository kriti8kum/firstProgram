package NewSession;

// Write a program to print all the ASCII values and their equivalent characters of 26 alphabtes using a while loop

// 65 - 90 = A - Z , 97- 123 = a- z
public class ASCIIValues {
    public static void main(String[] args) {
    for(int i = 97; i<=123; i++){
        System.out.println(i+" "+(char)i);
    }
    }
}

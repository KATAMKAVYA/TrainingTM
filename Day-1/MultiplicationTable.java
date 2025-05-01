//gitMultiplication Table with Loops
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; 

        // Forward using for loop
        for (int i = 1; i <= 10; i++) System.out.println(n + " x " + i + " = " + (n * i));

        // Reverse using for loop
        for (int i = 10; i >= 1; i--) System.out.println(n + " x " + i + " = " + (n * i));
        
        sc.close();
    }
}
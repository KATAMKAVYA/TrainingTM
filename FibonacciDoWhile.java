//Fibonacci Sequence using Do-While

public class FibonacciDoWhile {
    public static void main(String[] args) {
        int n = 5, a = 0, b = 1, count = 0;
        
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count < n);
    }
}
//Prime Number Check
public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println(isPrime(num) ? "Yes, " + num + " is a prime number" : "No, " + num + " is not a prime number");
    }
}
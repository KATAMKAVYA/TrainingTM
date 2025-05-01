//Check If a Number is Power of Two
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfTwo(num) ? "Yes, it is a power of two" : "No, it is not a power of two");
    }
}
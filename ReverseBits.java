// Reverse Bits of an Integer
public class ReverseBits {
    public static void main(String[] args) {
        int num = 5; // 0000 0101
        int reversed = 0;

        for (int i = 0; i < 8; i++) {
            reversed <<= 1;
            reversed |= (num & 1);
            num >>= 1;
        }

        System.out.println("Reversed Binary: " + Integer.toBinaryString(reversed));
        System.out.println("Equivalent Decimal: " + reversed);
    }
}
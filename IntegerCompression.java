//Integer Compression and Decompression

public class IntegerCompression {
    public static int encode(int n) {
        return n ^ 12345; // Simple XOR encoding
    }

    public static int decode(int encoded) {
        return encoded ^ 12345; // XOR decoding
    }

    public static void main(String[] args) {
        int encoded = encode(12345);
        System.out.println("Decoded: " + decode(encoded));
    }
}
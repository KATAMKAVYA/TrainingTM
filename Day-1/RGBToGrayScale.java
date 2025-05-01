//Convert RGB to Grayscale
public class RGBToGrayScale {
    public static int toGrayscale(int r, int g, int b) {
        return (int) ((r * 0.3) + (g * 0.59) + (b * 0.11));
    }

    public static void main(String[] args) {
        System.out.println("Grayscale: " + toGrayscale(255, 100, 50));
    }
}
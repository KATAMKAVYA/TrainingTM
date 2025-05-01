//Discount Calculator
public class DiscountCalculator {
    public static double calculateFinalPrice(double cartValue) {
        if (cartValue > 500) return cartValue * 0.8;
        if (cartValue >= 100) return cartValue * 0.9;
        return cartValue;
    }

    public static void main(String[] args) {
        System.out.println("Final Price: " + calculateFinalPrice(600));
    }
}
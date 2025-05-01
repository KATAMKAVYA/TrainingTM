
//Write a program that demonstrates type promotion in expressions involving mixed data types (e.g., int, float, double, char).

public class TypePromotion {
    public static void main(String[] args) {
        int a = 5;
        char b = 'A'; // ASCII value of 'A' is 65
        double c = 2.5;

        double result = a + b * c;
        System.out.println("Result of (a + b * c) = " + result);
    }
}
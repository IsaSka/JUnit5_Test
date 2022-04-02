public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        if (a > 99) {
            throw new IllegalArgumentException("X should be less than 100");
        }
        return a / b;
    }

    public int calculateAreaOfCircle(int r){
        int area = (int) (Math.PI * r * r);
        return area;
    }

    public double convertToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be 0");
        }
        return (double)numerator / (double)denominator;
    }

    public int[] numbers(int number1, int number2, int number3) {
        int[] listOfNumbers = {number1, number2, number3};
        return listOfNumbers;
    }
}

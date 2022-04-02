import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("5 + 5 = 10")
    void testAddingTwoNumbers() {
        assertEquals(10, calculator.add(5,5), "5 + 5 should equal 10");
    }

    @RepeatedTest(3)
    @DisplayName("5 * 5 = 25")
    void testMultiplyingTwoNumbers() {
        assertEquals(25, calculator.multiply(5, 5), "5 * 5 should equal 25");
    }

    @Test
    @DisplayName("Area = 50")
    void testAreaOfCircle(){
        assertEquals(50, calculator.calculateAreaOfCircle(4),
                "The area of a circle with radius 4 should be 50");
    }

    @Test
    @DisplayName("Succeeding converting to decimal" )
    void testConvertToDecimalSuccess() {
        double result = calculator.convertToDecimal(3, 4);
        assertEquals(0.75, result, "The decimal should be 0.75");
    }

    @Test
    @DisplayName("Exception when converting to decimal")
    void testConvertToDecimalInvalidDenominator() {
        assertThrows(IllegalArgumentException.class, () -> calculator.convertToDecimal(3, 0),
                "The use of an invalid denominator should result in an exception");
    }

    @Test
    @DisplayName("Arrays containing the same integers")
    void matchingArrayOfIntegers() {
        int[] actual = calculator.numbers(2,5,7);
        int[] expected = new int[]{2, 5, 7};
        assertArrayEquals(expected, actual, "The numbers in the array should match");
    }
}


package cegepst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {

    private FizzBuzzConverter fizzBuzzConverter;

    public FizzBuzzConverterTest() {
        fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
        assertEquals("Fizz", fizzBuzzConverter.convert(9));
        assertEquals("Fizz", fizzBuzzConverter.convert(21));
    }

    @Test
    public void tesBuzz() {
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
        assertEquals("Buzz", fizzBuzzConverter.convert(10));
        assertEquals("Buzz", fizzBuzzConverter.convert(20));
    }

    @Test
    public void tesFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(45));
    }

    @Test
    public void testNormal() {
        assertEquals("1", fizzBuzzConverter.convert(1));
        assertEquals("4", fizzBuzzConverter.convert(4));
    }
}
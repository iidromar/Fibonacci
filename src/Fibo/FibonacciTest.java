package Fibo;
import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test_Fibonacci() {
		int actualValue = Fibonacci.printFibonacciResult(5);
		int expectedValue = 5;
		assertEquals(actualValue, expectedValue);
	}
}

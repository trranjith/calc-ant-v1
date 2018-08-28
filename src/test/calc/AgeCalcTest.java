package test.calc;

import static org.junit.Assert.*;
import org.junit.Test;
import code.calc.AgeCalc;
import java.time.DateTimeException;

public class AgeCalcTest {

	@Test
	public void testCalculateAge_1() {
		String expectedOutput = "You are 2 years , 1 month , 2 days old";
		String actualOutput = AgeCalc.calculateAge("2016-5-10");
		boolean condition1 = actualOutput.startsWith(expectedOutput.substring(0, 6));
		boolean condition2 = actualOutput.endsWith("old");
		assertTrue(condition1 && condition2);
	}
	@Test(expected = DateTimeException.class)
	public void testCalculateAge_2() throws DateTimeException{
		String expectedOutput = "You are 2 years , 1 month , 2 days old";
		String actualOutput = AgeCalc.calculateAge("2019-5-10");
		assertTrue(expectedOutput.equals(actualOutput));
	}
}

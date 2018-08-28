package test.calc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import code.calc.EMICalc;

public class EMICalcTest {
   @Test
   public void testcalculateEMI_1(){
	   assertTrue(EMICalc.calculateEMI(50000,60,10) == 1062.35);
   }
}

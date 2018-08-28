package code.calc;
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * This code is for EMI calculation for the given tenure and loan amount
 */

public class EMICalc {
	public static double calculateEMI(double amount,int installments, double roi) {
		double emi = 0;
		double r= roi / (12 * 100); /*one month interest*/
		emi= (amount*r*Math.pow(1+r,installments))/(Math.pow(1+r,installments)-1);
		BigDecimal bd = new java.math.BigDecimal(emi);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		emi = bd.doubleValue();
		return emi;
	}
}

package code.calc;
import java.time.LocalDate;
import java.time.Period;
import java.time.DateTimeException;
/*
 * This code is for calculating age of a person
 */
public class AgeCalc {
	public static String calculateAge(String inputDate) throws DateTimeException{
		String temp[] = inputDate.split("-");
		String resultString = "You are ";
		int sum = 0;
		AgeCalc obj = new AgeCalc();
	    LocalDate todayDate = LocalDate.now();
	    try {
	    	LocalDate dobDate = LocalDate.of(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
		    Period intervalPeriod = Period.between(dobDate, todayDate);
		    int days = intervalPeriod.getDays();
		    int months = intervalPeriod.getMonths();
		    int years = intervalPeriod.getYears();
		    if(days < 0){
		    	throw new DateTimeException("Invalid day exception");
		    }
		    if(months < 0){
		    	sum=++sum;
		    	System.out.println(obj.getClass());
		    	throw new DateTimeException("Invalid month exception");
		    }
		    if(years < 0){
		    	throw new DateTimeException("Invalid year exception");
		    }
		    if(years != 0) {
		    	if(years == 1)
		    		resultString+= years+" year ";
		    	else
		    		resultString+= years+" years ";
		    }
		    if(months != 0) {
		    	if(resultString.equals("You are "))
		    		if(months == 1)
			    		resultString+= months+" month ";
			    	else
			    		resultString+= months+" months ";
		    	else
		    		if(months == 1)
		    			resultString+=", " +months+" month ";
		    		else
			    		resultString+= ", " +months+" months ";
		    }
		    if(days != 0) {
		    	if(resultString.equals("You are "))
		    		if(days == 1)
		    			resultString+= days+" day ";
		    		else
		    			resultString+= days+" days ";
		    	else
		    		if(days == 1)
		    			resultString+=", " +days+" day ";
		    		else
		    			resultString+=", " +days+" days ";
		    }
		    if(years == 0 && months == 0 && days == 0)
		    	resultString+="just born";
		    else
		    	resultString+="old";
	    }
	    
	    catch(DateTimeException e){
	    	throw e;
	    }
	    catch(Exception e) {
	    	throw e;
	    }
	    finally {
	    	obj = null;
	    }
	   	return resultString;
	}
}

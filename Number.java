package lab2_2;

public class Number {
	private double variable;

	public Number(double variable) {
		this.variable = variable;
	}
	
	public boolean isZero() {
		return variable == 0;
	}

	 public boolean isPositive() {
	        return variable > 0;
	    }
	 
	 public boolean isNegative() {
		 return variable < 0;
	 }
	
	 public boolean isOdd() { 
		return variable %2 != 0;	 
	 }
	 
	 public boolean isEven() {
		 return variable %2 == 0;
	 }
	 

	 public boolean isPrime() {
		    for (int i = 2; i < variable; i++) {
		        if (variable % i == 0) {
		            return false;
		        }
		    }
		    return true;
		}

//	 public boolean isArmstrong() {
//		 return false;
//	 }
	 
	 public double getFactorial() {
		   double result = 1;
	        for (int i = 1; i <= variable; i++) {
	            result *= i;
	        }
	        return result;
	    }
	 
	 public double getSqrt() {
		 double result = Math.sqrt(variable);
		 return result;
	 }
	 
	 public double getSqr() {
		 double result = variable*variable;
		 return result;
	 }
	 
//	 public double sumDigits() {
//	 
//	 }
//	 
//	 public double get Reverse() {
//		 
//	 }
//	 
//	 public void listFactor() {
//		 
//	 }
//	 
//	 public void displayBinary() {
//		 
//	 }
	 
	 
	 
	/**
	 * @return the variable
	 */
	public double getVariable() {
		return variable;
	}

	/**
	 * @param variable the variable to set
	 */
	public void setVariable(double variable) {
		this.variable = variable;
	}

	

}

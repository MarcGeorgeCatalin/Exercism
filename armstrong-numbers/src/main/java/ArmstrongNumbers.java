class ArmstrongNumbers {

	static boolean isArmstrongNumber(int numberToCheck) {
	    String numberToCheckAsString = String.valueOf(numberToCheck);
	    int numberOfDigits = numberToCheckAsString.length();
		int digit;
		int sum = 0;
		while (numberToCheck >= 1 ){
			digit = numberToCheck%10;
			numberToCheck = numberToCheck/10;
			sum += Math.pow(digit, numberOfDigits);
		}
		return sum == Integer.parseInt(numberToCheckAsString);
	}

}

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
        String intConvert = String.valueOf(numberToCheck);

	    double result = 0;
	    double power = intConvert.length();

        if (numberToCheck < 10) {
            return true;
        }

		for (int i = 0; i < power; i++) {
            int base = Integer.parseInt(String.valueOf(intConvert.charAt(i)));
		    result += Math.pow(base, power);

        }

        return result == numberToCheck;

	}

}

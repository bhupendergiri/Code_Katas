package com.bhupi.kaka.romannumerals;

public class RomanConverter {
	/**
	 * This method will convert the inputArabic to respective Roman literal
	 * ROMAN enum will be referred for this.
	 * @param inputArabic
	 * @return
	 */
	public String parseRoman(Integer inputArabic) {
		StringBuilder resultedString = new StringBuilder();

		while (inputArabic > 0) {
			for (ROMANS roman : ROMANS.values()) {
				if (inputArabic >= roman.toNumeric()) {
					resultedString.append(roman);
					inputArabic -= roman.toNumeric();//decreased by roman numeric value
					break;
				}
			}
		}
		System.out.println("resultedroman is  "+resultedString);
		return resultedString.toString();
	}

	/**
	 * 
	 * @param inputRoman
	 * @return
	 */
	public int parseArabic(String inputRoman) {

		String romanLiteralLeftToParse = inputRoman;
		int resultedArabic = 0;
		while (romanLiteralLeftToParse.length() > 0) {
			boolean match = false;
			for (ROMANS roman : ROMANS.values()) {
				System.out.println("romanLiteralLeftToParse="+romanLiteralLeftToParse+" and encountered roman="+roman);
				if (romanLiteralLeftToParse.startsWith(roman.toString())) {
					resultedArabic += roman.toNumeric();
					romanLiteralLeftToParse = romanLiteralLeftToParse
							.replaceFirst(roman.toString(), "");
					match = true;
					break;
				}
			}
			if (!match) {
				throw new IllegalArgumentException(inputRoman
						+ " value not supported");
			}
		}
		return resultedArabic;
	}
}

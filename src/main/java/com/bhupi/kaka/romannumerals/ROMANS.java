package com.bhupi.kaka.romannumerals;
/**
 * This enum is used for storing roman(arabic) values
 * Note: Descending Order is important here since 
 * 
 * @author user
 *
 */
public enum ROMANS {

	M(1000),CM(900),D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(
			9), V(5), IV(4), I(1);

	private int numeric;

	private ROMANS(int i) {
		numeric = i;
	}

	public int toNumeric() {
		return numeric;
	}

}

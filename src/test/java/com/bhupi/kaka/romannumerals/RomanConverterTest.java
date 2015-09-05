package com.bhupi.kaka.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bhupi.kaka.romannumerals.RomanConverter;

public class RomanConverterTest {

	RomanConverter obj;

	@Before
	public void setUp() {
		obj = new RomanConverter();
	}

	@Test
	public void testRoman_1() {

		String actual = obj.parseRoman(1);
		assertEquals("I", actual);
	}
	
	@Test
	public void testRoman_3() {
		String actual = obj.parseRoman(3);
		assertEquals("III", actual);
	}
	@Test
	public void testRoman_9() {
		String actual = obj.parseRoman(9);
		assertEquals("IX", actual);
	}
	@Test
	public void testRoman_1066() {
		String actual = obj.parseRoman(1066);
		assertEquals("MLXVI", actual);
	}
	@Test
	public void testRoman_1989() {
		String actual = obj.parseRoman(1989);
		assertEquals("MCMLXXXIX", actual);
	}
	@Test
	public void testArabic_1() {
		int actual = obj.parseArabic("I");
		assertEquals(1, actual);
	}
	@Test
	public void testArabic_3() {
		int actual = obj.parseArabic("III");
		assertEquals(3, actual);
	}
	@Test
	public void testArabic_6() {
		int actual = obj.parseArabic("VI");
		assertEquals(6, actual);
	}
	@Test
	public void testArabic_9() {
		int actual = obj.parseArabic("IX");
		assertEquals(9, actual);
	}
	@Test
	public void testArabic_1066() {
		int actual = obj.parseArabic("MLXVI");
		assertEquals(1066, actual);
	}
	@Test
	public void testArabic_1989() {
		int actual = obj.parseArabic("MCMLXXXIX");
		assertEquals(1989, actual);
	}
}

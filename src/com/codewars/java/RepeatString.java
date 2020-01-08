/************************************************************************************************
Write a function called repeatString which repeats the given String src exactly count times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
************************************************************************************************/

package com.codewars.java;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RepeatString {

	public static String repeatStr(final int repeat, final String string) {
		String s = "";
		for (int i = 1; i <= repeat; i++) {
			s += string;
		}
		return s;
	}

	public static String repeatStr1(final int repeat, final String string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeat; i++) {
			sb.append(string);
		}
		return sb.toString();
	}

	@Test
	public void test4a() {
		assertEquals("aaaa", RepeatString.repeatStr(4, "a"));
		assertEquals("HelloHelloHello", RepeatString.repeatStr(3, "Hello"));
		assertEquals("", RepeatString.repeatStr(5, ""));
		assertEquals("", RepeatString.repeatStr(0, "kata"));
		assertEquals("", RepeatString.repeatStr(-10, "kata"));

		assertEquals("aaaa", RepeatString.repeatStr1(4, "a"));
		assertEquals("HelloHelloHello", RepeatString.repeatStr1(3, "Hello"));
		assertEquals("", RepeatString.repeatStr1(5, ""));
		assertEquals("", RepeatString.repeatStr1(0, "kata"));
		assertEquals("", RepeatString.repeatStr1(-10, "kata"));
	}
}

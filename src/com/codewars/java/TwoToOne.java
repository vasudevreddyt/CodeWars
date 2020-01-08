/****************************************
INSTRUCTIONS:
Take 2 strings s1 and s2 including only letters from ato z. 
Return a new sorted string, the longest possible, containing distinct letters, 
- each taken only once - coming from s1 or s2.
EXAMPLE:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"
a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
/****************************************/
package com.codewars.java;

import static org.testng.Assert.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class TwoToOne {

	public static String longest(String s1, String s2) {
		String s = s1 + s2;
		s = Stream.of(s.split("")).distinct().sorted().collect(Collectors.joining());
		return s;
	}

	public static String longest2(String s1, String s2) {
		String out = "";
		String s = s1 + s2;
		for (char c = 'a'; c <= 'z'; c++) {
			if (s.contains(c + "")) {
				out += c;
			}
		}
		return out;
	}

	public static String longest3(String s1, String s2) {
		String all = "abcdefghijklmnopqrstuvwxyz";
		return all.replaceAll("[^" + s1 + s2 + "]", "");
	}

	@Test
	public void test() {
		System.out.println("\nlongest Fixed Tests");
		assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));

		System.out.println("\nlongest Fixed Tests");
		assertEquals("aehrsty", TwoToOne.longest2("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", TwoToOne.longest2("loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy", TwoToOne.longest2("inmanylanguages", "theresapairoffunctions"));

		System.out.println("\nlongest Fixed Tests");
		assertEquals("aehrsty", TwoToOne.longest3("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", TwoToOne.longest3("loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy", TwoToOne.longest3("inmanylanguages", "theresapairoffunctions"));
	}

}

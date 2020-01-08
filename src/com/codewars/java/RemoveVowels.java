/***************************************************************************************
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
****************************************************************************************************/

package com.codewars.java;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RemoveVowels {

	public static String disemvowel(String str) {
		str = str.replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replace("a", "")
				.replace("e", "").replace("i", "").replace("o", "").replace("u", "");
		return str;
	}

	public static String disemvowel1(String str) {
		str = str.replaceAll("[aeiouAEIOU]", "");
		return str;
	}

	public static String disemvowel2(String str) {
		str = str.replaceAll("(?i)[aeiou]", "");
		;
		return str;
	}

	@Test
	public void FixedTests() {
		assertEquals("Ths wbst s fr lsrs LL!", RemoveVowels.disemvowel("This website is for losers LOL!"));
		assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
				RemoveVowels.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
		assertEquals("Wht r y,  cmmnst?", RemoveVowels.disemvowel("What are you, a communist?"));

		assertEquals("Ths wbst s fr lsrs LL!", RemoveVowels.disemvowel1("This website is for losers LOL!"));
		assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
				RemoveVowels.disemvowel1("No offense but,\nYour writing is among the worst I've ever read"));
		assertEquals("Wht r y,  cmmnst?", RemoveVowels.disemvowel1("What are you, a communist?"));

		assertEquals("Ths wbst s fr lsrs LL!", RemoveVowels.disemvowel2("This website is for losers LOL!"));
		assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
				RemoveVowels.disemvowel2("No offense but,\nYour writing is among the worst I've ever read"));
		assertEquals("Wht r y,  cmmnst?", RemoveVowels.disemvowel2("What are you, a communist?"));
	}
}

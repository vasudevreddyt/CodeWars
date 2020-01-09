/**************************************************************************************************************************************** 
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
****************************************************************************************************************************************/

package com.codewars.java.kyu7;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Stringendswith {
	public static boolean solution(String str, String ending) {
		return str.endsWith(ending);
	}

	@Test
	public void testSomething() {
		assertEquals(true, solution("abc", "bc"));
		assertEquals(false, solution("abc", "d"));
	}
}

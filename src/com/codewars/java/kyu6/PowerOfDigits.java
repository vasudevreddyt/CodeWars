/**********************************************************************************************

	Some numbers have funny properties. For example:
	
	89 --> 8¹ + 9² = 89 * 1
	
	695 --> 6² + 9³ + 5�?�= 1390 = 695 * 2
	
	46288 --> 4³ + 6�?�+ 2�?� + 8�?� + 8�?� = 2360688 = 46288 * 51
	
	Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
	
	we want to find a positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal to k * n.
	In other words:
	
	Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
	
	If it is the case we will return k, if not return -1.
	
	Note: n and p will always be given as strictly positive integers.
	
	digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
	digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
	digPow(695, 2) should return 2 since 6² + 9³ + 5�?�= 1390 = 695 * 2
	digPow(46288, 3) should return 51 since 4³ + 6�?�+ 2�?� + 8�?� + 8�?� = 2360688 = 46288 * 51
**********************************************************************************************/

package com.codewars.java.kyu6;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PowerOfDigits {

	public static long digPow(int n, int p) {

		char[] digits = new Integer(n).toString().toCharArray();
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += Math.pow(Character.getNumericValue(digits[i]), p + i);
		}
		if (sum % n == 0) {
			return sum/n;
		} else {
			return -1;
		}

	}

	@Test
	public void Test1() {
		assertEquals(1, PowerOfDigits.digPow(89, 1));
		assertEquals(-1, PowerOfDigits.digPow(92, 1));
		assertEquals(51, PowerOfDigits.digPow(46288, 3));
	}
}

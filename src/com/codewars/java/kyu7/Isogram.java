/************************************************************************************************
An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
Implement a function that determines whether a string that contains only letters is an isogram. 
Assume the empty string is an isogram. 
Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case
*************************************************************************************************/

package com.codewars.java.kyu7;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Isogram {

	public static boolean isIsogram(String str) {
		// Convert the string in lower case letters
		str = str.toLowerCase();

		// Finding the lendgth of the string
		int len = str.length();

		// Converting the string to chracter array
		char arr[] = str.toCharArray();

		// Sort the array in ascending order
		Arrays.sort(arr);

		// Loop the array and compare the characters which are side by side
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}

	public static boolean isIsogram2(String str) {
		return str.toLowerCase().chars().distinct().count() == str.length();
	}

	@Test
	public void FixedTests() {
		assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
		assertEquals(true, Isogram.isIsogram("isogram"));
		assertEquals(false, Isogram.isIsogram("moose"));
		assertEquals(false, Isogram.isIsogram("isIsogram"));
		assertEquals(false, Isogram.isIsogram("aba"));
		assertEquals(false, Isogram.isIsogram("moOse"));
		assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
		assertEquals(true, Isogram.isIsogram(""));

		// Isogram2

		assertEquals(true, Isogram.isIsogram2("Dermatoglyphics"));
		assertEquals(true, Isogram.isIsogram2("isogram"));
		assertEquals(false, Isogram.isIsogram2("moose"));
		assertEquals(false, Isogram.isIsogram2("isIsogram"));
		assertEquals(false, Isogram.isIsogram2("aba"));
		assertEquals(false, Isogram.isIsogram2("moOse"));
		assertEquals(true, Isogram.isIsogram2("thumbscrewjapingly"));
		assertEquals(true, Isogram.isIsogram2(""));

	}

}

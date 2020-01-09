/**
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

package com.codewars.java.kyu7;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Mumbling {

	public static String accum(String s) {
		String out = "";
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			String firstcharacter = Character.toString(arr[i]).toUpperCase();
			String secondCharacter = Character.toString(arr[i]).toLowerCase();
			String str = "";
			for (int j = 0; j < i; j++) {
				str += secondCharacter;
			}
			String thirdCharacter = "";
			if (i != arr.length - 1) {
				thirdCharacter = "-";
			}
			out += firstcharacter + str + thirdCharacter;
		}
		return out;
	}

	public static String accum1(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (char c : s.toCharArray()) {
			if (i > 0)
				sb.append('-');
			sb.append(Character.toUpperCase(c));
			for (int j = 0; j < i; j++)
				sb.append(Character.toLowerCase(c));
			i++;
		}
		return sb.toString();
	}

	@Test
	public void test() {
		assertEquals(Mumbling.accum("ZpglnRxqenU"),
				"Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
		assertEquals(Mumbling.accum("NyffsGeyylB"),
				"N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
		assertEquals(Mumbling.accum("MjtkuBovqrU"),
				"M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
		assertEquals(Mumbling.accum("EvidjUnokmM"),
				"E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
		assertEquals(Mumbling.accum("HbideVbxncC"),
				"H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
	}

	@Test
	public void test1() {
		assertEquals(Mumbling.accum1("ZpglnRxqenU"),
				"Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
		assertEquals(Mumbling.accum1("NyffsGeyylB"),
				"N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
		assertEquals(Mumbling.accum1("MjtkuBovqrU"),
				"M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
		assertEquals(Mumbling.accum1("EvidjUnokmM"),
				"E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
		assertEquals(Mumbling.accum1("HbideVbxncC"),
				"H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
	}

}

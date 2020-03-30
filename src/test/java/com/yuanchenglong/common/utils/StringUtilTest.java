package com.yuanchenglong.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength(" ");
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		boolean hasLength = StringUtil.hasText(" ");
		System.out.println(hasLength);
	}
	
	@Test
	public void getChar() {
		char char1 = StringUtil.getChar();
		System.out.println(char1);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(4);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}

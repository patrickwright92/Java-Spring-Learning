package com.pwright.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
		boolean test = todos.contains("AWS");
		
		//boolean shortcut
		assertTrue("Something went wrong",test);
		
		//assertNull, assertNotNull, assertFalse
		
		assertArrayEquals(new int[] {1,2}, new int[] {1,2}, "Error Text");
		
		assertEquals(3, todos.size(), "Error Message");
		
	}

}

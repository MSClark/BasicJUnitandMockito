package com.msclark.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void sum() {
		MyMath myMath = new MyMath();
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	/* Asserts:
	 * assertNotnull
	 * assertNull
	 * assertFalse
	 * assertTrue
	 * assertArrayEquals 
	 */
	
	/* Annotations
	 * @Test
	 * @Before - run something before EACH test
	 * @After
	 * @BeforeClass - run something before ALL tests
	 * @AfterClass
	 */

}

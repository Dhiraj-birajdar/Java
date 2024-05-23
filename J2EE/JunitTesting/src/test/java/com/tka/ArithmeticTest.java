package com.tka;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test 
	public void testSum() {
		Assert.assertEquals(1  , Arithmetic.sum(1, 0));	
	}
	
	@Test 
	public void testSub() {
		Assert.assertEquals(1  , Arithmetic.sub(1, 0));	
	}
	
	@Test 
	public void testSqrArr() {
		Assert.assertArrayEquals(new int[]{0,1,4,9,16}, Arithmetic.sqrArr(5));
	}
	
	@Test
	public void testIsEven() {
		Assert.assertFalse(Arithmetic.isEven(5)); 
	}
	@Test
	public void testNotNull() {
		Assert.assertNotEquals(null, "hello".getClass());
	}

}

package com.tka;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class DbTest {
	
	@Test
	public void testNotNull() {
		Assert.assertNotEquals(null, Db.getData());
	}	
	
}
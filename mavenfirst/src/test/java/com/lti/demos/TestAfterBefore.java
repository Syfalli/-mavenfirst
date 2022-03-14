package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestAfterBefore {
	@BeforeAll
	public void sum()
	{
	Assertions.assertEquals("Up","Up");
	System.out.println(" before All");
	}
	@BeforeAll
	public static void dbConn()
	{
		Assertions.assertEquals("Up","Up");
	}
	

	@Test 
	public void testadd()
	{
		Calculators c= new Calculators();
		int r = c.add(300, 200);
		Assertions.assertEquals(500,r);
	}
	@Test
	void testAssertFalse() {

	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@AfterEach
	public void testSumZero()
	{

	System.out.println(" After Each ");
	}


	@AfterAll
	public static void testDbClosed()
	{
	System.out.println("db connection closed ");
	System.out.println(" After All - db conn closed ");
	}
	
}

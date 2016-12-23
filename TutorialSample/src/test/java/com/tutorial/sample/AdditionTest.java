/**
 * 
 */
package com.tutorial.sample;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ritika.Malhotra
 *
 */
public class AdditionTest {

	static Addition addition;
	
	@BeforeClass
	public static void setup(){
		addition=new Addition();
	}
	
	@Test
	public void testAdd_PositiveValues_Success() {
		assertEquals(10,addition.add(5, 5));
	}

	@Test
	public void testAdd_PositiveValues_Failure() {
		assertNotEquals(10,addition.add(5, 6));
	}
	
	@Test
	public void testAdd_NegativeValues_PostiveResult_Success() {
		assertEquals(1,addition.add(-5, 6));
	}
	
	@Test
	public void testAdd_NegativeValues_NegativeResult_Success() {
		assertEquals(-11,addition.add(-5, -6));
	}
	
	@Test
	public void testAdd_NegativeValues_Failure() {
		assertNotEquals(6,addition.add(-5, 6));
	}
}

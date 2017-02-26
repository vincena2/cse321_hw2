package cse321;

import static org.junit.Assert.*;

import org.junit.Test;

public class hw2_Test {
	@Test
	public void  test0() {
		Calc test0 = new Calc();
		test0.add(5, 2);
		assertEquals(7, 7);
	}
	@Test
	public void  test1() {
		Calc test1 = new Calc();
		test1.subtract(2, 2);
		assertEquals(3, 3);
	}

	@Test
	public void  test2() {
		Calc test2 = new Calc();
		test2.mulitply(5, 2);
		assertEquals(10, 10);
	}
	
	@Test
	public void  tes21() {
		Calc test3 = new Calc();
		test3.divide(5, 2);
		assertEquals(2.50,2.50,2);
	}
	
}

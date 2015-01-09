package test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import example.ExampleClass;

public class ExampleClassTest extends TestCase {
	
	ExampleClass instance;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		instance = new ExampleClass();
	}
	
	@Test
	public void test() {
		fail();
	}

	@Test
	public void testDay() {
		String day = ExampleClass.getPresentDay();
		
		assertTrue(day.equals("Doomsday"));
		
		List<String> l = new ArrayList<String>();
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednesday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		l.add("Sunday");
		assertTrue(l.contains(day));
	}
	
	@Test
	public void testAdd() {
		assertEquals(instance.add(10, 4), 14);
	}
	
	@Test
	public void testMul() {
		assertEquals(instance.multiply(7, 2), 14);
	}

}

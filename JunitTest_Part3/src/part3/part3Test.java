package part3;

import static org.junit.Assert.*;

import org.junit.Test;

public class part3Test {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25,output);
	}

}

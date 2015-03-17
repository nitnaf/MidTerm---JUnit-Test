import static org.junit.Assert.*;

import org.junit.Test;


public class MyClassTest {

	@Test
	public void test() {
		
		MyClass x = new MyClass();
		assertEquals("Output is not 'true'", true, x.ReturnTrue());
		
		int result = x.AddTwoNumbers(2, 2);
		assertEquals("Output is not 4", 4, result);
	
	}

}

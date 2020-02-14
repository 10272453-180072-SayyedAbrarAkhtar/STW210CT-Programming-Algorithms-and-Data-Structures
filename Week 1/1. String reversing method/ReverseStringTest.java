import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseString() {
		String expResult, result;
		ReverseString rev = new ReverseString();
		result = ReverseString.reverseString("Hello!");
		expResult = "!olleH";
		
		assertEquals(expResult, result);
	}

	
}

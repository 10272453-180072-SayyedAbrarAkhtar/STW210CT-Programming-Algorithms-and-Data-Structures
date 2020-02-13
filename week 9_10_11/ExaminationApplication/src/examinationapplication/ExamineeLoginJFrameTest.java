package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamineeLoginJFrameTest {

	@Test
	void testLogin() {
		boolean expResult, result = false;
        String uname = "test";
        String key = "test";
        ExamineeLoginJFrame instance = new ExamineeLoginJFrame();
        result = instance.login(uname, key);
        expResult = true;
        assertEquals(expResult, result);
	}

}

package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminLoginJFrameTest {

	@Test
	void testLogin() {
		boolean expResult, result = false;
        String uname = "admin";
        String key = "admin";
        AdminLoginJFrame instance = new AdminLoginJFrame();
        result = instance.login(uname, key);
        expResult = true;
        assertEquals(expResult, result);
	}



}

package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminRegisterJFrameTest {

	@Test
	void testAddAdmin() {
		boolean expResult, result = false;
		String name = "new";
        String uname = "test";
        String pass = "pass";
        String confirmpass = "pass";
        String email = "email";
        String contact = "00000000";
        AdminRegisterJFrame instance = new AdminRegisterJFrame();
        result = instance.addAdmin(name, uname, pass, confirmpass, email, contact);
        expResult = true;
        
        assertEquals(expResult, result);
	}

	@Test
	void testIsPresent() {
		boolean expResult, result = false;
        String uname = "test";
        AdminRegisterJFrame instance = new AdminRegisterJFrame();
        result = instance.isPresent(uname);
        expResult = false;
        assertEquals(expResult, result);
	}

	@Test
	void testIsFieldEmpty() {
		boolean expResult, result = false;
		String name = "";
        String uname = "";
        String pass = "pass";
        String confirmpass = "pass";
        String email = "email";
        String contact = "";
        AdminRegisterJFrame instance = new AdminRegisterJFrame();
        result = instance.isFieldEmpty(name, uname, pass, confirmpass, email, contact);
        expResult = true;
        
        assertEquals(expResult, result);
	}

}

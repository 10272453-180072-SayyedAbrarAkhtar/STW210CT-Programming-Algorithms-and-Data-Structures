package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpdateAdminJFrameTest {

	@Test
	void testUpdateAdmin() {
		boolean expResult, result = false;
		String name = "new";
        String pass = "pass";
        String confirmpass = "pass";
        String email = "email";
        String contact = "00000000";
        UpdateAdminJFrame instance = new UpdateAdminJFrame();
        result = instance.updateAdmin(name, pass, confirmpass, email, contact);
        expResult = true;
	}

	@Test
	void testIsFieldEmpty() {
		boolean expResult, result = true;
		String name = "new";
        String pass = "pass";
        String confirmpass = "pass";
        String email = "email";
        String contact = "00000000";
        UpdateAdminJFrame instance = new UpdateAdminJFrame();
        result = instance.isFieldEmpty(name, pass, confirmpass, email, contact);
        expResult = false;
        
        assertEquals(expResult, result);
	}

	

}

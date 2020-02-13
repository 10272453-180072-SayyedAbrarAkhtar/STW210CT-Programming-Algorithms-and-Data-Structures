package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegisterExamineeJFrameTest {

	
	@Test
	void testAddExaminee() {
		boolean expResult, result = false;
		
        RegisterExamineeJFrame instance = new RegisterExamineeJFrame();
        result = instance.addExaminee("h", "h", "h", "h", "h", "h", "Female");
        expResult = true;
        
        assertEquals(expResult, result);
	}
	
	
	@Test
	void testIsPresent() {
		boolean expResult, result = false;
        String uname = "test";
        RegisterExamineeJFrame instance = new RegisterExamineeJFrame();
        result = instance.isPresent(uname);
        expResult = true;
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
        String gender = "";
        RegisterExamineeJFrame instance = new RegisterExamineeJFrame();
        result = instance.isFieldEmpty(name, uname, pass, confirmpass, email, contact, gender);
        expResult = true;
        
        assertEquals(expResult, result);
	}

	

}

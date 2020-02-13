package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpdateExamineeJFrameTest {

	@Test
	void testUpdateExaminee() {
		boolean expResult, result = false;
		String name = "new";
        String pass = "pass";
        String confirmpass = "pass";
        String email = "email";
        String contact = "00000000";
        String gender = "Male";
        int eid = 8;
        UpdateExamineeJFrame instance = new  UpdateExamineeJFrame();
        result = instance.updateExaminee(name, pass, confirmpass, email, contact, gender, eid);
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
        UpdateExamineeJFrame instance = new  UpdateExamineeJFrame();
        result = instance.isFieldEmpty(name, pass, confirmpass, email, contact);
        expResult = false;
        
        assertEquals(expResult, result);
	}

}

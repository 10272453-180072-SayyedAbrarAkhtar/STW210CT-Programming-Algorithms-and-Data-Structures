package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DashboardJFrameTest {
	String uname="test", pass="test";
	@Test
	void testGetsetId() {
		/* Set id of set name "Nepal" is 2 in database  */
		int expResult, result;
		String setname = "Nepal";
        DashboardJFrame instance = new DashboardJFrame(uname, pass);
        result = instance.getsetId(setname);
        expResult = 2;
        
        assertEquals(expResult, result);
	}

	@Test
	void testGetexamineeId() {
		/* Exmainee id of username:"test" and password:"test:  is 5 in database  */
		int expResult, result; 
        DashboardJFrame instance = new DashboardJFrame(uname, pass);
        result = instance.getexamineeId(uname, pass);
        expResult = 5;
        
        assertEquals(expResult, result);
	}

	@Test
	void testLoadTable() {
		boolean expResult, result = false;
		DashboardJFrame instance = new DashboardJFrame(uname, pass);
        result = instance.loadTable();
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testLoadComboBox() {
		boolean expResult, result = false;
		DashboardJFrame instance = new DashboardJFrame(uname, pass);
		result = instance.loadComboBox();
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testIsSetAttempted() {
		/* Examines with id:5 has attempted the quiz   */
		boolean expResult, result = false;
		DashboardJFrame instance = new DashboardJFrame(uname, pass);
		instance.getsetId("Computer");
		instance.getexamineeId(uname, pass);
		result = instance.isSetAttempted();
        expResult = true;
        assertEquals(expResult, result);
	}

}

package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HomeWindowJFrameTest {

	@Test
	void testLoadAdminData() {
		/* username = admin and password = admin */
		boolean expResult, result = false;
		HomeWindowJFrame instance = new HomeWindowJFrame("admin", "admin");
        result = instance.loadAdminData();
        expResult = true;
        assertEquals(expResult, result);
	}

}

package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewQuestionSetJFrameTest {

	

	@Test
	void testAddNewSet() {
		boolean expResult, result = false;
		
		String setname = "c sharp"; 
		
		NewQuestionSetJFrame instance = new NewQuestionSetJFrame();
        result = instance.addNewSet(setname);
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testRetrieveSet() {
		Boolean expResult, result;
		NewQuestionSetJFrame instance = new NewQuestionSetJFrame();
        result = instance.retrieveSet();
        expResult = true;
        
        assertEquals(expResult, result);
	}

	@Test
	void testUpdateSet() {
		boolean expResult, result = false;
		
		String setname = "c #"; 
		
		NewQuestionSetJFrame instance = new NewQuestionSetJFrame();
        result = instance.updateSet(setname, 10);
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testDeleteSet() {
		boolean expResult, result = false;
		
		String setname = "c #"; 
		
		NewQuestionSetJFrame instance = new NewQuestionSetJFrame();
        result = instance.deleteSet(setname, 10);
        expResult = true;
        assertEquals(expResult, result);
	}

}

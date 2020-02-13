package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuizzJFrameTest {
	
	int setid = 9, eid = 5;
	
	@Test
	void testStoreResult() {
		Boolean expResult, result=false;
		
		QuizzJFrame instance = new QuizzJFrame(setid, eid);
		result = instance.storeResult();
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testRetrieveSetname() {
		Boolean expResult, result;
		QuizzJFrame instance = new QuizzJFrame(setid, eid);
        result = instance.retrieveSetname(setid);
        expResult = true;
        
        assertEquals(expResult, result);
	}

	@Test
	void testCountQuestion() {
		int expResult, result;
		QuizzJFrame instance = new QuizzJFrame(setid, eid);
		result = instance.countQuestion(setid);
        expResult = 1;
        
        assertEquals(expResult, result);
	}

}

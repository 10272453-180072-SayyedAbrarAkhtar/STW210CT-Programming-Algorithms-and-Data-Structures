package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultJFrameTest {

	int score = 8;
	int examineeid = 8;
    int setid = 9;
    
	@Test
	void testGetExamineeName() {
		boolean expResult, result = false;
        ResultJFrame instance = new ResultJFrame(score, examineeid, setid);
        result = instance.getExamineeName(examineeid);
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testGetSetName() {
		boolean expResult, result = false;
        ResultJFrame instance = new ResultJFrame(score, examineeid, setid);
        result = instance.getSetName(setid);
        expResult = true;
        assertEquals(expResult, result);
	}

}

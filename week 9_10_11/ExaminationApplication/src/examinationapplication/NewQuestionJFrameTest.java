package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewQuestionJFrameTest {

	@Test
	void testLoadTable() {
		boolean expResult, result = false;
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.loadTable();
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testLoadComboBox() {
		boolean expResult, result = false;
		NewQuestionJFrame instance = new NewQuestionJFrame();
		result = instance.loadComboBox();
        expResult = true;
        assertEquals(expResult, result);
	}

	@Test
	void testGetquesId() {
		/* Set id of set name "Nepal" is 2 in database  */
		int expResult, result;
		String ques = "FAQ stands for - ";
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.getquesId(ques);
        expResult = 14;
        
        assertEquals(expResult, result);
	}
	
	@Test
	void testGetsetId() {
		/* Set id of set name "Nepal" is 2 in database  */
		int expResult, result;
		String setname = "Nepal";
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.getsetId(setname);
        expResult = 2;
        
        assertEquals(expResult, result);
	}

	@Test
	void testGetsetName() {
		/*  Set name of set id 2 is "Nepal"  in database  */
		int setid = 2 ;
		String expResult, result;
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.getsetName(setid);
        expResult = "Nepal";
        
        assertEquals(expResult, result);
	}
	
	@Test
	void testAddQuestion() {
		boolean expResult, result = false;
		String question = "Which of the below is valid way to instantiate an array in java?";
		String a = "int myArray [] = {1, 3, 5}";
		String b = "int myArray [] [] = {1,2,3,4}";
		String c = "int [] myArray = (5, 4, 3)";
		String d = "String d int [] myArray = {1, 2, 3}"; 
		String e = "none";
		String correctans = "a";
		int setid = 1; /* set id of java in database is 1 */ 
		
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.addQuestion(question, a, b, c, d, e, correctans, setid);
        expResult = true;
        assertEquals(expResult, result);
	}

	
	@Test
	void testUpdateQuestion() {
		boolean expResult, result = false;
		String question = "Which of the below is valid way to instantiate an array in java?";
		String a = "int myArray [] = {1, 3, 5}";
		String b = "int myArray [] [] = {1,2,3,4}";
		String c = "int [] myArray = (5, 4, 3)";
		String d = "all"; 
		String e = "none";
		String correctans = "a";
		int setid = 1; /* set id of java in database is 1 */ 
		int qid = 48;
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.updateQuestion(question, a, b, c, d, e, correctans, setid, qid);
        expResult = true;
        assertEquals(expResult, result);
	}
	
	
	@Test
	void testDeleteQuestion() {
		boolean expResult, result = false;
		int qid = 47;
		NewQuestionJFrame instance = new NewQuestionJFrame();
        result = instance.deleteQuestion(qid);
        expResult = true;
        assertEquals(expResult, result);
	}

	
	

	

}

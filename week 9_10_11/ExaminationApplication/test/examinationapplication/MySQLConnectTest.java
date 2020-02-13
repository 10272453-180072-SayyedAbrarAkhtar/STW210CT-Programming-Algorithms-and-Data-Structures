package examinationapplication;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class MySQLConnectTest {

	@Test
	void testCloseConnection() {
		Boolean expResult, result=false;
		MySQLConnect conn = new MySQLConnect();
		try {
			result = conn.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		expResult = true;
		assertEquals(expResult, result);
	}

	@Test
	void testExecuteSQLQuery() {
		Boolean expResult, result=false;
		String query = "UPDATE `admin` SET `email` = 'quiz@quiz.com' WHERE `admin`.`id` = 5 ";
		String message = "upated";
		MySQLConnect conn = new MySQLConnect();
		result = conn.executeSQLQuery(query, message);
		expResult = true;
		assertEquals(expResult, result);
	}

	@Test
	void testRetrieveData() {
		Boolean expResult, result=false;
		ResultSet resultset;
		String query = "SELECT * FROM `admin`";
		MySQLConnect conn = new MySQLConnect();
		resultset = conn.retrieveData(query);
		try {
			result = resultset.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		expResult = true;
		assertEquals(expResult, result);
	}

}

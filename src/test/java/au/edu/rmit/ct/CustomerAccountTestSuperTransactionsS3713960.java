/**
*  
* Name: Yiding Luo
* Student ID: s3713960
* Email: s3713960@student.rmit.edu.au
* 
* [OPTIONAL: add any notes here about the code]
*/
package au.edu.rmit.ct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Please replace S3214321 of class name with your own student number
 */

class CustomerAccountTestSuperTransactionsS3713960 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("test getAvailableBalance mothod")
	void testGetAvailableBalance() throws Exception{
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
	    assertEquals(100, CA1.getAvailableBalance());
	}

	@Test
	@DisplayName("test getTotalBalance mothod")
	void testGetTotalBalance() throws Exception{
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
	    assertEquals(200, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test debit mothod")
	void testGetDebit() throws Exception{
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
	    CA1.debit(50);
		assertEquals(50,CA1.getAvailableBalance());
		assertEquals(150, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test credit mothod")
	void testGetCredit() throws Exception{
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
	    CA1.credit(50);
		assertEquals(100,CA1.getAvailableBalance());
		assertEquals(250, CA1.getTotalBalance());
	}

}

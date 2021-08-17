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
import org.junit.jupiter.api.Assertions;
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
	void testGetAvailableBalance() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		assertEquals(100, CA1.getAvailableBalance());
	}

	@Test
	@DisplayName("test getTotalBalance mothod")
	void testGetTotalBalance() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		assertEquals(200, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test debit mothod")
	void testGetDebit() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CA1.debit(50);
		assertEquals(50, CA1.getAvailableBalance());
		assertEquals(150, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test debit exceeds availablebalance and totalbalance ")
	// The debit system does not consider the excess debit, so a negative balance
	// cannot throw an exception
	void testExceedDebit() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CA1.debit(2000);
		assertEquals(-1900, CA1.getAvailableBalance());
		assertEquals(-1800, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test invalid debit ")
	void testInvalidDebit() throws Exception {
		// The debit system does not consider the case of invalid debit
		// so debit is a negative number and cannot throw an exception
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CA1.debit(-300);
		assertEquals(400, CA1.getAvailableBalance());
		assertEquals(500, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test credit mothod")
	void testGetCredit() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CA1.credit(50);
		assertEquals(100, CA1.getAvailableBalance());
		assertEquals(250, CA1.getTotalBalance());
	}

	@Test
	@DisplayName("test invalid credit")
	void testInvalidCredit() throws Exception {
		// The Credit system does not consider the case of invalid crebit
		// so Credit is a negative number and cannot throw an exception
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CA1.credit(-5000);
	}

	@Test
	@DisplayName("test getAvailableBalance with wrong userAccountNumber")
	void getAvailableBalanceWithWrongUserAccountNumber() {
		CustomerAccount CA1;
		try {
			// Getavailablebalance does not handle the exception of account error,
			// so it will not throw an exception when the account is wrong
			CA1 = new CustomerAccount(11111, 1111, 100.00, 200.00, "AN", "GN", 111);
			BankDatabaseNew BD1 = new BankDatabaseNew();
			BD1.add(CA1);
			double gab1 = BD1.getAvailableBalance(111222);
			BD1.clear();
		} catch (Exception e) {
			fail("There are no exceptions here");
		}

	}

	@Test
	@DisplayName("test getTotalBalance with wrong userAccountNumber")
	void getgetTotalBalanceWithWrongUserAccountNumber() {
		CustomerAccount CA1;
		try {
			// getTotalBalance does not handle the exception of account error,
			// so it will not throw an exception when the account is wrong
			CA1 = new CustomerAccount(11111, 1111, 100.00, 200.00, "AN", "GN", 111);
			BankDatabaseNew BD1 = new BankDatabaseNew();
			BD1.add(CA1);
			double gtb1 = BD1.getTotalBalance(111333);
			BD1.clear();
		} catch (Exception e) {
			fail("There are no exceptions here");
		}

	}

}

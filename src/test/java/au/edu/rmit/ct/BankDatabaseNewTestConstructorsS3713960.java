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
import java.util.ArrayList;

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
class BankDatabaseNewTestConstructorsS3713960 {

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
	@DisplayName("Test add(CustomerAccount ca) method")
	void AddCustomer() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		BankDatabaseNew BD1 = new BankDatabaseNew();
		BD1.add(CA1);
		assertEquals(false, BD1.isEmpty());
		assertEquals(1, BD1.size());
		BD1.clear();
	}

	@Test
	@DisplayName("Test Catching Exception thrown by add already exist Customer")
	void AddExistCustomer() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		// CustomerAccount CA2 = new CustomerAccount(11112, 1112, 100, 200, "AaN",
		// "GaN", 211);
		ArrayList<CustomerAccount> AL1 = new ArrayList<>();
		AL1.add(CA1);
		Assertions.assertThrows(Exception.class, () -> {
			BankDatabaseNew BD1 = new BankDatabaseNew(AL1);
			BD1.add(CA1);
			BD1.clear();
		});
	}

	@Test
	@DisplayName("test Catching Exception thrown by clear an empty database")
	void ClearEmptyDatabase() {
		Assertions.assertThrows(Exception.class, () -> {
			BankDatabaseNew BD1 = new BankDatabaseNew();
			BD1.clear();
		});
	}

	@Test
	@DisplayName("Test if seedcustomers is not empty, seedcustomers can add in CustomerAccount")
	void AddArrayListInSeed() throws Exception {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		ArrayList<CustomerAccount> AL1 = new ArrayList<>();
		AL1.add(CA1);
		BankDatabaseNew BD1 = new BankDatabaseNew(AL1);
		assertEquals(false, BD1.isEmpty());
		assertEquals(1, BD1.size());
		BD1.clear();

	}

	@Test
	@DisplayName("Test Catching Exception thrown by seedcustomers is empty")
	void AddEmptyArrayListInSeed() throws Exception {
		ArrayList<CustomerAccount> AL2 = new ArrayList<>();
		Assertions.assertThrows(Exception.class, () -> {
			BankDatabaseNew BD1 = new BankDatabaseNew(AL2);
			BD1.clear();
		});

	}

}

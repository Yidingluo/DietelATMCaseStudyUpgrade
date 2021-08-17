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
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Please replace S3214321 of class name with your own student number
 */

class BankDatabaseNewTestSortingS3713960 {

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
	@DisplayName("test catch the exceptions when sort By TotalBalance")
	void testSortByTotalBalance(){
		try {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CustomerAccount CA2 = new CustomerAccount(11112, 1112, 300, 500, "BN", "GNa", 108);
		CustomerAccount CA3 = new CustomerAccount(11113, 1113, 1010, 1900, "CN", "GNb", 222);
		CustomerAccount CA4 = new CustomerAccount(11114, 1114, 20, 70, "DN", "DNc", 987);
		CustomerAccount CA5 = new CustomerAccount(11115, 1115, 55, 66, "EN", "GNsa", 665);
		CustomerAccount CA6 = new CustomerAccount(11116, 1116, 178, 275, "FN", "GNss", 345);
		CustomerAccount CA7 = new CustomerAccount(11117, 1117, 987, 999, "GN", "GNiu", 287);
		CustomerAccount CA8 = new CustomerAccount(11118, 1118, 667, 760, "HN", "GNmn", 290);
		CustomerAccount CA9 = new CustomerAccount(11119, 1119, 6312, 9980, "IN", "GNnb", 148);
		CustomerAccount CA10 = new CustomerAccount(11110, 1110, 982, 1900, "JN", "GNqwe", 399);
		BankDatabaseNew BD1 = new BankDatabaseNew();
	    BD1.add(CA1);
		BD1.add(CA2);
		BD1.add(CA3);
		BD1.add(CA4);
		BD1.add(CA5);
		BD1.add(CA6);
		BD1.add(CA7);
		BD1.add(CA8);
		BD1.add(CA9);
		BD1.add(CA10);
		BD1.sortByTotalBalance();
		BD1.clear();
			
		} catch (Exception e) {
			fail("There are no exceptions here");
		}
	}

	@Test
	@DisplayName("test catch the exceptions when sort By BSB")
	void testSortByBSB(){
		try {
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CustomerAccount CA2 = new CustomerAccount(11112, 1112, 300, 500, "BN", "GNa", 108);
		CustomerAccount CA3 = new CustomerAccount(11113, 1113, 1010, 1900, "CN", "GNb", 222);
		CustomerAccount CA4 = new CustomerAccount(11114, 1114, 20, 70, "DN", "DNc", 987);
		CustomerAccount CA5 = new CustomerAccount(11115, 1115, 55, 66, "EN", "GNsa", 665);
		CustomerAccount CA6 = new CustomerAccount(11116, 1116, 178, 275, "FN", "GNss", 345);
		CustomerAccount CA7 = new CustomerAccount(11117, 1117, 987, 999, "GN", "GNiu", 287);
		CustomerAccount CA8 = new CustomerAccount(11118, 1118, 667, 760, "HN", "GNmn", 290);
		CustomerAccount CA9 = new CustomerAccount(11119, 1119, 6312, 9980, "IN", "GNnb", 148);
		CustomerAccount CA10 = new CustomerAccount(11110, 1110, 982, 1900, "JN", "GNqwe", 399);
		BankDatabaseNew BD1 = new BankDatabaseNew();
	    BD1.add(CA1);
		BD1.add(CA2);
		BD1.add(CA3);
		BD1.add(CA4);
		BD1.add(CA5);
		BD1.add(CA6);
		BD1.add(CA7);
		BD1.add(CA8);
		BD1.add(CA9);
		BD1.add(CA10);
		BD1.sortByBSB();
		BD1.clear();
			
		} catch (Exception e) {
			fail("There are no exceptions here");
		}
	}

	@Test
	@DisplayName("test sort By TotalBalance results are correct")
	void testSortByTotalBalanceResults() throws Exception{
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CustomerAccount CA2 = new CustomerAccount(11112, 1112, 300, 500, "BN", "GNa", 108);
		CustomerAccount CA3 = new CustomerAccount(11113, 1113, 1010, 1900, "CN", "GNb", 222);
		CustomerAccount CA4 = new CustomerAccount(11114, 1114, 20, 70, "DN", "DNc", 987);
		CustomerAccount CA5 = new CustomerAccount(11115, 1115, 55, 66, "EN", "GNsa", 665);
		CustomerAccount CA6 = new CustomerAccount(11116, 1116, 178, 275, "FN", "GNss", 345);
		CustomerAccount CA7 = new CustomerAccount(11117, 1117, 987, 999, "GN", "GNiu", 287);
		CustomerAccount CA8 = new CustomerAccount(11118, 1118, 667, 760, "HN", "GNmn", 290);
		CustomerAccount CA9 = new CustomerAccount(11119, 1119, 6312, 9980, "IN", "GNnb", 148);
		CustomerAccount CA10 = new CustomerAccount(11110, 1110, 982, 1900, "JN", "GNqwe", 399);
		BankDatabaseNew BD1 = new BankDatabaseNew();
	    BD1.add(CA1);
		BD1.add(CA2);
		BD1.add(CA3);
		BD1.add(CA4);
		BD1.add(CA5);
		BD1.add(CA6);
		BD1.add(CA7);
		BD1.add(CA8);
		BD1.add(CA9);
		BD1.add(CA10);
		assertEquals(10, BD1.size());
		BD1.sortByTotalBalance();
		List<CustomerAccount> L1 = BD1.export();
		for (int i = 0; i < 9; i++)
		{
			CustomerAccount CurrentP; 
			CurrentP = L1.get(i);
			CustomerAccount NextP;
			NextP = L1.get(i+1);
			Boolean sorta = (CurrentP.getTotalBalance() <= NextP.getTotalBalance());
			assertEquals(true, sorta);
		}
		BD1.clear();
	}

	@Test
	@DisplayName("test sort By BSB results are correct")
	void testSortByBSBResults() throws Exception{
		CustomerAccount CA1 = new CustomerAccount(11111, 1111, 100, 200, "AN", "GN", 111);
		CustomerAccount CA2 = new CustomerAccount(11112, 1112, 300, 500, "BN", "GNa", 108);
		CustomerAccount CA3 = new CustomerAccount(11113, 1113, 1010, 1900, "CN", "GNb", 222);
		CustomerAccount CA4 = new CustomerAccount(11114, 1114, 20, 70, "DN", "DNc", 987);
		CustomerAccount CA5 = new CustomerAccount(11115, 1115, 55, 66, "EN", "GNsa", 665);
		CustomerAccount CA6 = new CustomerAccount(11116, 1116, 178, 275, "FN", "GNss", 345);
		CustomerAccount CA7 = new CustomerAccount(11117, 1117, 987, 999, "GN", "GNiu", 287);
		CustomerAccount CA8 = new CustomerAccount(11118, 1118, 667, 760, "HN", "GNmn", 290);
		CustomerAccount CA9 = new CustomerAccount(11119, 1119, 6312, 9980, "IN", "GNnb", 148);
		CustomerAccount CA10 = new CustomerAccount(11110, 1110, 982, 1900, "JN", "GNqwe", 399);
		BankDatabaseNew BD1 = new BankDatabaseNew();
	    BD1.add(CA1);
		BD1.add(CA2);
		BD1.add(CA3);
		BD1.add(CA4);
		BD1.add(CA5);
		BD1.add(CA6);
		BD1.add(CA7);
		BD1.add(CA8);
		BD1.add(CA9);
		BD1.add(CA10);
		assertEquals(10, BD1.size());
		BD1.sortByBSB();
		List<CustomerAccount> L1 = BD1.export();
		for (int i = 0; i < 9; i++)
		{
			CustomerAccount CurrentP; 
			CurrentP = L1.get(i);
			CustomerAccount NextP;
			NextP = L1.get(i+1);
			Boolean sortb = (CurrentP.getBSB() <= NextP.getBSB());
			assertEquals(true, sortb);
		}
		BD1.clear();
	}
		
}

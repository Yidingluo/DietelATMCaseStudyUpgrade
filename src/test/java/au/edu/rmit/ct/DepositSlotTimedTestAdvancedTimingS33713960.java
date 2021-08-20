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

class DepositSlotTimedTestAdvancedTimingS33713960 {

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
	@DisplayName("test the Deposit Slot will not allow deposit to be received before it's activated")
	void notAllowBeforeActivated() throws Exception {
		DepositSlotTimed time1 = new DepositSlotTimed("Slot1", 2000);
		assertEquals(false, time1.isOpenForDeposit());
		assertEquals(false, time1.receiveEnvelope());
	}

	@Test
	@DisplayName("test allow deposits during the period of activation")
	void allowDuringActivation() throws Exception {
		DepositSlotTimed time1 = new DepositSlotTimed("Slot2", 2000);
		time1.activateSlotWithTimedShut();
		Thread.sleep(1000);
		assertEquals(true, time1.isOpenForDeposit());
	}

	@Test
	@DisplayName("test once again stop allowing deposits after the period of activation")
	void notAllowAfterOnceActivation() throws Exception {
		DepositSlotTimed time1 = new DepositSlotTimed("Slot3", 2000);
		time1.activateSlotWithTimedShut();
		Thread.sleep(2000);
		assertEquals(true, time1.isOpenForDeposit());
		Thread.sleep(1000);
		assertEquals(false, time1.isOpenForDeposit());
	}

}

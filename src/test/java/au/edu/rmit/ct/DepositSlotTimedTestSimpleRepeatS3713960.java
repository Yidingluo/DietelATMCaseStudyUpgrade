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

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/*
 * Please replace S3214321 of class name with your own student number
 */

class DepositSlotTimedTestSimpleRepeatS3713960 {

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
	@RepeatedTest(10)
    @DisplayName("Depositslottimed repeat test")
	void repratTestDepositslottimed() throws Exception{
		DepositSlotTimed time1 = new DepositSlotTimed("AN", 2000);
		assertTimeout(Duration.of(2001, ChronoUnit.MILLIS), () -> {
			time1.checkTimer();
		});
	}
}

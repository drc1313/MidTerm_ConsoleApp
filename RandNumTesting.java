package console_app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
public class RandNumTesting {

	RandomNumberAdder instance;

	@BeforeEach
	void setUp() throws Exception {
		instance = new RandomNumberAdder();
	}

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

// Check that addition method works correctly	
	@Test
	void pass1() {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};		
		assertEquals(55,instance.adder(numbers));		
	}
	
//	Ensure that the method continues to generate new numbers
	@Test
	void pass2() {
		instance.numberGen();
		int[] firstSet = instance.getNumbers();
		instance.numberGen();
		assertEquals(true, firstSet != instance.getNumbers());
	}
	
//	Ensure that the print method outputs correctly
	@Test
	void pass3() {
		int[] nums = instance.getNumbers();
		assertEquals("+"+nums[0]+"+"+nums[1]+"+"+nums[2]+"+"+nums[3]+"+"+nums[4]+"+"+nums[5]+"+"+
		nums[6]+"+"+nums[7]+"+"+nums[8]+"+"+nums[9]+"="+instance.adder(nums), instance.toString());
	}
		


}

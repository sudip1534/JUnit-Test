package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTestPositive {

	@Test
	void test() {
			JunitTesting test =new JunitTesting();
				double output=test.divide(10,2);
					
				assertEquals(5,output);
			
}
}

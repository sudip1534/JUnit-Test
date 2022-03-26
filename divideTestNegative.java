package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTestNegative {

	@Test
	void test() {
	
	
try {
	
	JunitTesting test =new JunitTesting();
	test.divide(10, 0);
	fail("Expected an illegalArgumentException to be thrown");
	}
catch(IllegalArgumentException e){
	assertEquals(e.getMessage(),"Division by zero is not supported");
	
	}
catch(Throwable t) {
	fail("Expected an illegalArgumentException to be thrown");
}
}
}
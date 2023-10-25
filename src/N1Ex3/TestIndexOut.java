package N1Ex3;

import org.junit.jupiter.api.Test;

public class TestIndexOut {
	
	@Test
	public void testClass() {
		ListClass testListClass = new ListClass();
		
		try {
			testListClass.getElement(2);
		}catch(IndexOutOfBoundsException ex) {
			return;
		}
		throw new AssertionError("AssertionError.");
		
	}
}

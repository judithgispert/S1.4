package N1Ex3;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestIndexOut {
	
	@Test
	public void testClass() {
		ListClass testListClass = new ListClass();
		ArrayList<String> testList = new ArrayList<String>();
		
		try {
			testListClass.getElement(testList, 2);
		}catch(IndexOutOfBoundsException ex) {
			return;
		}
		throw new AssertionError("AssertionError.");
		
	}
}

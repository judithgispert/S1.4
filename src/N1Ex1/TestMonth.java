package N1Ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestMonth {

	@Test
	public void testSize() {
		
		int sizeResult = Month.getMonthList().size();
		int sizeWanted = 12;
		
		assertEquals(sizeWanted, sizeResult);
		
	}
	
	@Test
	public void testMonth() {
		
		String monthResult = Month.getMonthList().get(8-1);
		String monthWanted = "August";
		
		assertEquals(monthWanted, monthResult);
	}
	

}

package N1Ex3;

import static org.junit.Assert.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestIndexOut {
	
	@Test
	public void testClass() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			ListClass s = new ListClass();
			s.getElement(4);
		});
	}
}

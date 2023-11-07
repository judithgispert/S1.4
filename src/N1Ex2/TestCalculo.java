package N1Ex2;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;



class TestCalculo {
	
	
	@Parameterized.Parameters
	@CsvSource({"76152918, X", "14261733, P", "76152738, Z", "48103644, H", "44103642, S", "98166243, N", "88714232, N", "66514428, S",
			"66453273, V", "32356736, Z"})
	

	@ParameterizedTest
	public void TestCalculoDni(int numDni, char expResult) {
		char result = CalculoDni.letterDni(numDni);
		assertEquals(expResult, result);
	}

}

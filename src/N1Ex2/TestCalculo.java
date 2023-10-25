package N1Ex2;


import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)

class TestCalculo {
	
	
	@Parameterized.Parameters
	@CsvSource({"76152918, X", "14261733, P", "76152738, Z", "48103644, H", "44103642, S", "98166243, N", "88714232, N", "66514428, S",
			"66453273, V", "32356736, Z"})
	

	@Test
	public void TestCalculoDni(int numDni, char expResult) {
		CalculoDni calculoDni = new CalculoDni();
		char result = calculoDni.letterDni(numDni);
		assertEquals(expResult, result);
	}

}

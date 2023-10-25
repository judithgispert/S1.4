package N1Ex2;

public class CalculoDni {
	
	public char letterDni(int numDni) {
		
		int numLetter = (numDni % 23);
		
		String letters = "TRWAGMYFPDXBNJZSQVHLCK";
		
		char letterDni = letters.charAt(numLetter);
		
		return letterDni;
	}

}

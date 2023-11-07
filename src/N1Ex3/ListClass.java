package N1Ex3;

import java.util.ArrayList;

public class ListClass {
	

	
	public String getElement (int cont) throws IndexOutOfBoundsException{
		ArrayList <String> elementsList = new ArrayList<String>();
		elementsList.add("Wave");
		elementsList.add("Ocean");
		elementsList.add("River");
		return elementsList.get(cont);
	}

}

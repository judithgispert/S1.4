package N1Ex3;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
	
	private List<String> listClassArray;
	
	public ListClass() {
		new ArrayList<String>();
	}
	
	public List<String> getListClassArray(){
		return listClassArray;
	}
	
	public String getElement (int cont){
		return listClassArray.get(cont);
	}

}

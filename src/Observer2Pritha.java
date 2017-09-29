package hw5;

import java.util.ArrayList;

public class Observer2Pritha implements Observer{
	private TextStateSubject textState;
	String inputStr;

	public Observer2Pritha (TextStateSubject textState) {
		this.textState = textState;
	}
	
	public void update(String inputStr, ArrayList<String> vArray,ArrayList<String> cArray,ArrayList<String> dArray) {
		System.out.println("Name: " + this.getClass().getSimpleName() + ", Consonants found: " + cArray + 
				", Number of Consonants: "  + cArray.size());
	}
}

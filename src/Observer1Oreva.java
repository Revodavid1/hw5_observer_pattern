package hw5;

import java.util.ArrayList;

public class Observer1Oreva implements Observer{
	private TextStateSubject textState;
	String inputStr;

	public Observer1Oreva (TextStateSubject textState) {
		this.textState = textState;
	}
	
	
	public void update(String inputStr, ArrayList<String> vArray,ArrayList<String> cArray,ArrayList<String> dArray) {
		
		System.out.println("Name: " + this.getClass().getSimpleName() + ", Vowels found: " + vArray + 
				", Number of Vowels: "  + vArray.size());
			}
}


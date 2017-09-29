package hw5;

import java.util.ArrayList;

public class Observer3Abdul implements Observer{
	private TextStateSubject textState;
	String inputStr;
	

	public Observer3Abdul (TextStateSubject textState) {
		this.textState = textState;
	}
	
	public void update(String inputStr, ArrayList<String> vArray,ArrayList<String> cArray,ArrayList<String> dArray) {
		System.out.println("Name: " + this.getClass().getSimpleName() + ", Digits found: " + dArray + 
				", Number of Digits: "  + dArray.size());
	}

}

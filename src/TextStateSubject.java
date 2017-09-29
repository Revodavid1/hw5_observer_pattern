package hw5;

import java.util.ArrayList;

public interface TextStateSubject {
	public void registerObservers(Observer obs);
	public void removeObserver(Observer obs);
	void notifyObservers(String inputStr, ArrayList<String> vArray, ArrayList<String> cArray, ArrayList<String> dArray);
}

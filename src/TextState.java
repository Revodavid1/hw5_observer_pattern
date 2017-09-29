package hw5;

import java.util.*;

public class TextState implements TextStateSubject{
	
	static ArrayList<Observer> observers;
	static int observerSize;
	static String arrytoString;
	
	
	public TextState() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObservers(Observer obs) {
		// TODO Auto-generated method stub
		observers.add(obs);
	}
	
	public void removeObserver(Observer obs) {
		observers.remove(obs);
		observerSize = observers.size();
	}
	
	public static void printwaitingObserver() {
		observerSize = observers.size();
		for (Observer observer : observers) {
			System.out.println(observer.getClass().getSimpleName() + " is waiting for TextState Notifications");
	}
		}
	
	
	@Override
	public void notifyObservers(String inputStr, ArrayList<String> vArray,ArrayList<String> cArray,ArrayList<String> dArray) {
		// TODO Auto-generated method stub
		observerSize = observers.size();
		if (observerSize == 0) {
			System.out.println("No Observer to send this notification");
		}
		else {
			for (Observer obs : observers) {
				obs.update(inputStr, vArray, cArray, dArray);
		}
		}
		
	}
	
	public void status(Observer obs) {
		if (observers.contains(obs)) {
			System.out.println(obs.getClass().getSimpleName() + " registered");
		}
		else {
			System.out.println(obs.getClass().getSimpleName() + " not registered for notifications");
		}
		}

}
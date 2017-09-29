package hw5;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	static Scanner scanStr = new Scanner(System.in);
	static String command;
	static TextState textState = new TextState();
	static Observer1Oreva oreva = new Observer1Oreva(textState);
	static Observer2Pritha pritha = new Observer2Pritha(textState);
	static Observer3Abdul abdul = new Observer3Abdul(textState); 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputString(command);
		
	}

	public static void inputString(String command) {
		System.out.print("Enter command: ");
		command = scanStr.nextLine().toLowerCase();
		 String[] commandSplit = command.split(" ");
		
		
		if (command.equals("quit")) {
			terminate();
		}
		else if (command.equals("register observers")) {
			if (TextState.observerSize > 0) {
				System.out.println("Cannot register observer");
				inputString(command);
			}
			else {
			textState.registerObservers(oreva);
			textState.registerObservers(pritha);
			textState.registerObservers(abdul);
			TextState.printwaitingObserver();
			inputString(command);
			}
		}
		else if (command.equals("status")) {;
			textState.status(oreva);
			textState.status(pritha);
			textState.status(abdul);
			inputString(command);
		}	
		
		else if (command.equals("unregister")) {
			int arrySz = TextState.observerSize;
			if (arrySz == 0) {
				System.out.println("No observer to remove");
				inputString(command);
			}
			else {
			textState.removeObserver(oreva);
			textState.removeObserver(pritha);
			textState.removeObserver(abdul);
			System.out.println("All Observers unregistered");	
			inputString(command);
			}
		}
		else if (commandSplit[0].equals("send")) {
			int countVowels = 0;
			int countConsonants = 0;
			int countDigits = 0;
			int clength = command.length();
			ArrayList<String> vArray = new ArrayList<String>();
			ArrayList<String> cArray = new ArrayList<String>();
			ArrayList<String> dArray = new ArrayList<String>();
			for (int i=0;i < clength; i++) {
				  char scanChar = command.charAt(i);
				  if (scanChar == 'a' || scanChar == 'e' || scanChar == 'i' || scanChar == 'o' 
						  || scanChar == 'u'){
					  String vowelFound = Character.toString(scanChar);
					  vArray.add(vowelFound);
					  int varraySize = vArray.size();
					  if (varraySize == 5) {
						  textState.removeObserver(oreva);
					  }
					  }
				   if (scanChar == 'b' || scanChar == 'c' || scanChar == 'd' || scanChar == 'f' 
						   || scanChar == 'g' 
					  || scanChar == 'h' || scanChar == 'j' || scanChar == 'k'
					  || scanChar == 'l' || scanChar == 'm' || scanChar == 'n' || scanChar == 'p' 
					  || scanChar == 'q' 
					  || scanChar == 'r'
					  || scanChar == 's' || scanChar == 't' || scanChar == 'v' || scanChar == 'w' 
					  || scanChar == 'x'
					  || scanChar == 'y' || scanChar == 'z'){
				  String consFound = Character.toString(scanChar);
				  cArray.add(consFound); 
				  int carraySize = cArray.size();
				  if (carraySize == 10) {
					  textState.removeObserver(pritha);
				  }
				  }
				  if (scanChar == '0' || scanChar == '1' || scanChar == '2' || scanChar == '3' || 
						  scanChar == '4' || scanChar == '5' 
						  || scanChar == '6' || scanChar == '7' || scanChar == '8' || scanChar == '9'){
					  String digitFound = Character.toString(scanChar);
					  dArray.add(digitFound);
		        }
			}
			textState.notifyObservers(command, vArray, cArray, dArray);
			inputString(command);
		
			}
		else {
			System.out.println("Unknown command");
			inputString(command);
		}
				
	}
	
	public static void terminate() {
		scanStr.close();
		System.out.println("Program terminated");
		}
	
	


}

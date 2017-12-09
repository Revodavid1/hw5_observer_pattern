# hw5 - The Observer pattern assignment

Use Case is described below.

Use Case 1:  User quits program

The user types in the word “quit”.  The program terminates.  If the command is not recognized, the Controller object prints out “unknown command”.

Use Case 2: User registers observers

User types in “register observers”.  This will cause all 3 observers of the TextState class to register for notifications of the TextState object.  Each observer will print out that it is waiting for TextState notifications.  When registered in this way, all counts inside the observers will be reset to their starting values.

Use Case 3: User gets status of observers

User types in “status”.  Each of the 3 observers of the TextState object return whether they are listening for TextState notifications or not.  If the TextStateObserver is registered for TextState notifications, it will print “<name of observer> registered”.  If the TextStateObserver is not registered for TextState notifications, it will print “<name of observer> not registered for notifications”.  Note that <name of the observer> will be “Observer 1”, “Observer 2” or “Observer 3”.

Use Case 4:  (Grad students) User unregisters observers.

User types in “unregister”.  All observers of the TextState object unregister themselves.

Use Case 5:  User sends text to observers.

User types in “send”, followed by a space, followed by a string of text.  Example: “send 3 headed aliens”

Observer 1 prints out the name of the observer, the vowels and the  number of vowels in the string.  Observer 2 prints out the name of the observer, the consonants and the number of consonants in the string.  Observer 3 reports the prints out the name of the observer, the digits found and the number of digits in the string.

Observer 1 will unregister after finding 5 vowels.  Observer 2 will unregister after finding 10 consonants.  Observer 3 will not unregister itself.

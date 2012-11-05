package MVCGame;

import java.util.Observable;



public class Model extends Observable {
	
	int counter = 0 ;
	
	
	public Model(){
	}
	
	
	void incrementCounter()
	{
		++counter;
		setChanged();
		notifyObservers(counter);
	
	}
}

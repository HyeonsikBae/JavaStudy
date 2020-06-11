package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer{
	
	@Override
	public void update(Observable o, Object arg) {

		String msg = (String)arg;
		System.out.println("감시자 B.변화 감지 : " + msg);
	}
}

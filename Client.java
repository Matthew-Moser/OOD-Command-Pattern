package part1;

public class Client {
	public static void main (String[] args) {
		Controller control = new Controller();
		Timer timer = new Timer();
		Command TimerOnAction = new TimerOnAction(timer);
		Command TimerOffAction = new TimerOffAction(timer);
		//turning the timer on
		control.setCommand(TimerOnAction);
		control.pressButton();
		//turning the timer off
		control.setCommand(TimerOffAction);
		control.pressButton();
	}
}

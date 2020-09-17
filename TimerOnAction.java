package part1;

public class TimerOnAction implements Command{
	Timer timer;
	public TimerOnAction (Timer timer) {
	this.timer = timer;
	}
@Override
	public void executeAction() {
	timer.startClock();
	
	}
}

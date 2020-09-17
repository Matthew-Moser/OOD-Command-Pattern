package part1;

public class TimerOffAction implements Command{
	Timer timer;
	public TimerOffAction (Timer timer) {
	this.timer = timer;
	}
	@Override
	public void executeAction() {
		timer.stopClock();
		
	}
}

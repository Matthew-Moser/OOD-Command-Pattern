package part1;

public class Controller {
	private Command command;
	public void setCommand (Command command) {
		this.command = command;
	}
	public void pressButton() {
		command.executeAction();
	}
}

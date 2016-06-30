package main;

//频道切换命令ConcreteCommand  
public class CommandChange implements Command {
	private Tv myTv;

	private int channel;

	public CommandChange(Tv tv, int channel) {
		this.myTv = tv;
		this.channel = channel;
	}

	public void execute() {
		myTv.changeChannel(channel);
	}
}

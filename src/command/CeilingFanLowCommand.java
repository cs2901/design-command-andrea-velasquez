package command;

public class CeilingFanLowCommand implements Command {
    Fan fan;

    public CeilingFanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.low();
    }
}

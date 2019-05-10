package command;

import receiver.Fan;

public class CeilingFanHighCommand implements Command {
    Fan fan;

    public CeilingFanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }
}

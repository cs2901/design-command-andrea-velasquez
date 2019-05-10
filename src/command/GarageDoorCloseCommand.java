package command;

import receiver.Door;

public class GarageDoorCloseCommand implements Command {
    Door door;

    public GarageDoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() { door.close(); }
}

package invoker;
import command.Command;

import java.util.*;

public class RemoteControl {
    private Vector<Command> commands = new Vector<Command>();

    public int addcommand(Command c){
        commands.add(c);
        return commands.size();
    }

    public int getNumberOfCommands() { return commands.size(); }

    public void buttonNumberWasPressed(int n) {
        if (n>commands.size()) System.out.println("Invalid button number");
        else commands.get(n).execute();
    }
}

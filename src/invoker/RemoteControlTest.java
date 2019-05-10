package invoker;

import command.*;
import receiver.*;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Create lights commands
        Room livingRoom = new Room();
        LightOnCommand livingLightOn = new LightOnCommand(livingRoom.light);
        LightOffCommand livingLightOff = new LightOffCommand(livingRoom.light);

        Room kitchen = new Room();
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchen.light);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchen.light);

        // Create ceiling fan commands
        Fan fan = new Fan();
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(fan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(fan);

        // Create garage door commands
        Door door = new Door();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(door);

        // Create stereo commands
        Stereo stereo = new Stereo();
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);

        Command[] listOfCommands = {livingLightOn, livingLightOff, kitchenLightOn, kitchenLightOff, ceilingFanHigh,
                                    ceilingFanLow, garageDoorOpen, garageDoorClose, stereoOn, stereoOff};
        String[] titles = {"Living room", "Kitchen", "Ceiling", "Garage", "Stereo"};

        /* Simple Remote Control */
        // Assign commands and execute
        SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
        System.out.println("SimpleRemoteControl");

        int counter = 0;
        for (int i=0; i<titles.length; ++i){
            System.out.println("\n" + titles[i]);
            for (int j=0; j<2; ++j){
                simpleRemote.setCommand(listOfCommands[counter]);
                simpleRemote.buttonWasPressed();
                ++counter;
            }
        }
        /* Remote Control */
        System.out.println("\n\n==============================");
        System.out.println("RemoteControl\n");

        // Assign commands
        RemoteControl remote = new RemoteControl();
        for (int i=0; i<listOfCommands.length; ++i) remote.addcommand(listOfCommands[i]);

        // Execute commands
        counter = 0;
        for (int i=0; i<titles.length; ++i){
            System.out.println("\n" + titles[i]);
            for (int j=0; j<2; ++j){
                remote.buttonNumberWasPressed(counter);
                ++counter;
            }
        }
    }
}

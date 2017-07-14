package RemoteControl.Command;

import RemoteControl.Receiver.GarageDoor;

/**
 * Created by cyntara on 4/17/17.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}

package RemoteControl.Command;

import RemoteControl.Receiver.GarageDoor;

/**
 * Created by cyntara on 4/17/17.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}

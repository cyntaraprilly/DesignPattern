package RemoteControl.Command;

import RemoteControl.Receiver.Light;

/**
 * Created by cyntara on 4/17/17.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

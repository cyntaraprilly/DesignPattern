package RemoteControl.Command;

import RemoteControl.Receiver.Light;

/**
 * Created by cyntara on 4/17/17.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

package RemoteControl.Invoker;

import RemoteControl.Command.Command;

/**
 * Created by cyntara on 4/17/17.
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonIsPressed(){
        command.execute();
    }
}

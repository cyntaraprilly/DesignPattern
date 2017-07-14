package RemoteControl.Invoker;

import RemoteControl.Command.Command;
import RemoteControl.Command.NoCommand;

/**
 * Created by cyntara on 4/17/17.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand ){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonIsPressed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonIsPressed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Remote control: \n");
        for (int i = 0; i<onCommands.length;i++){
            stringBuffer.append("slot["+i+"]: " +onCommands[i].getClass().getName() + "\n\t\t " +offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}

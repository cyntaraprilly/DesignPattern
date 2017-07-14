package CommandPattern2.Invoker;

import CommandPattern2.Command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyntara on 4/17/17.
 */
public class Employee {
        Command command;
        List<Command> commandList = new ArrayList<>();


    public Employee() {

    }

    public void setCommand(Command command) {
        this.command = command;
        commandList.add(command);
    }

    public void work(){
        command.execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nList of command you did today:\n");
        for (Command command : commandList){
            stringBuffer.append(">" +command.getClass().getName() +"\n");
        }
        return stringBuffer.toString();
    }

}

package RemoteControl;

import RemoteControl.Command.GarageDoorCloseCommand;
import RemoteControl.Command.GarageDoorOpenCommand;
import RemoteControl.Command.LightOffCommand;
import RemoteControl.Command.LightOnCommand;
import RemoteControl.Invoker.RemoteControl;
import RemoteControl.Receiver.GarageDoor;
import RemoteControl.Receiver.Light;

/**
 * Created by cyntara on 4/17/17.
 */
public class Main {
    public static void main(String[] args) {
//        SimpleRemoteControl remoteInvoker = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//
//        remoteInvoker.setCommand(lightOnCommand);
//        remoteInvoker.buttonIsPressed();

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Light bedRoomLight = new Light("Bedroom");
        LightOnCommand bedroomLightOn = new LightOnCommand(bedRoomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedRoomLight);


        Light kitchenLight = new Light("Kitchen");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, bedroomLightOn, bedroomLightOff);
        remoteControl.setCommand(2, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonIsPressed(0);
        remoteControl.onButtonIsPressed(1);
        remoteControl.offButtonIsPressed(2);
        remoteControl.offButtonIsPressed(3);



    }
}

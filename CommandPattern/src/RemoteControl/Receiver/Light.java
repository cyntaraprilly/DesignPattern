package RemoteControl.Receiver;

/**
 * Created by cyntara on 4/17/17.
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println( name +  " light is on");
    }

    public void off(){
        System.out.println( name + " light is off");
    }
}

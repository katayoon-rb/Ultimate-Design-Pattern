import bridge.RemoteControl;
import bridge.SamsungTV;

public class Main {
    public static void main(String[] args) {
        var remote = new RemoteControl(new SamsungTV());
        remote.turnOn();
    }
}
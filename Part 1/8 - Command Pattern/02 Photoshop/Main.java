import command.BlackAndWhiteCommand;
import command.CompositeCommand;
import command.ResizeCommand;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
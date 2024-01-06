package state;

public class EeaserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }
    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }
}

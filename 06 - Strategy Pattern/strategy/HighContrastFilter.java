package strategy;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Applying high contrast filter");
    }
}

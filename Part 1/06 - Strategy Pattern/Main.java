import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store(
                "a",
                new JpegCompressor(),
                new BlackAndWhiteFilter()
        );
    }
}
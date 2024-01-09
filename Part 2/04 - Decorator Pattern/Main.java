import decorator.CloudStream;
import decorator.CompressedCloudStream;
import decorator.EncryptedCloudStream;
import decorator.Stream;

public class Main {
    public static void main(String[] args) {
        var compressed = new CompressedCloudStream(new CloudStream());
        storeCreditCard(new EncryptedCloudStream(compressed));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1452-5412-8544-5412");
    }
}
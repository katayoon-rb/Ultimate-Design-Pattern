package decorator;

public class EncryptedCloudStream implements Stream {
  private Stream stream;
  public EncryptedCloudStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void write(String data) {
    stream.write(encrypt(data));
  }

  private String encrypt(String data) {
    return "!@#$(!@#*()*)(*!@#";
  }
}

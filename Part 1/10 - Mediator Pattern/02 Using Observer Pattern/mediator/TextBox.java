package mediator;

public class TextBox extends UIControl {
  private String content;
  public void setContent(String content) {
    this.content = content;
    notifyObservers();
  }
  public String getContent() {
    return content;
  }
}

package mediator;

public class TextBox extends UIControl {
  private String content;
  public TextBox(DialogBox owner) {
    super(owner);
  }

  public void setContent(String content) {
    this.content = content;
    owner.changed(this);
  }
  public String getContent() {
    return content;
  }
}

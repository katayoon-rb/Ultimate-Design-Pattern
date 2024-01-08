package mediator;

public class Button extends UIControl {
  private boolean isEnabled;
  public Button(DialogBox owner) {
    super(owner);
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
    owner.changed(this);
  }
  public boolean isEnabled() {
    return isEnabled;
  }
}

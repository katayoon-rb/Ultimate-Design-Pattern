package mediator;

public class Button extends UIControl {
  private boolean isEnabled;
  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
    notifyObservers();
  }
  public boolean isEnabled() {
    return isEnabled;
  }
}

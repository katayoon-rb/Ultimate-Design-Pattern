package obsever;

public class DataSource extends Subject {
    public int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        notifyObserver(value);
    }
}

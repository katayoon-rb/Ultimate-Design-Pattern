import abstractFactory.ant.AntWidgetFactory;
import abstractFactory.app.ContactForm;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
    }
}
import iterator.BrowserHistory;
import iterator.MyIterator;

public class Main {
    public static void main(String[] args) {
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        MyIterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.current() );
            iterator.next();
        }
    }
}
import visitor.AnchorNode;
import visitor.HeadingNode;
import visitor.HighlightOperation;
import visitor.HtmlDocument;

public class Main {
    public static void main(String[] args) {
        var doc = new HtmlDocument();
        doc.add(new HeadingNode());
        doc.add(new AnchorNode());
        doc.execute(new HighlightOperation());
    }
}
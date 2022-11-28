package ChainOfResponsibility;

public class TitleCase extends ProcessingObject<String> {
    public String handleWork(String text) {
        if (text.length() == 0)
            return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}

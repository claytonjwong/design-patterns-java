package ChainOfResponsibility;

public class ExclamationMark extends ProcessingObject<String> {
    public String handleWork(String text) {
        return text + "!";
    }
}

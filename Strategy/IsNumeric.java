package Strategy;

public class IsNumeric implements ValidationStrategy {
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}

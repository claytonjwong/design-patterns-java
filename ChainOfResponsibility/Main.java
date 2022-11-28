package ChainOfResponsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        ProcessingObject<String> titleCase = new TitleCase();
        ProcessingObject<String> exclamationMark = new ExclamationMark();
        titleCase.setSuccessor(exclamationMark);
        String input = "howdy there partner";
        String output = titleCase.handle(input);
        System.out.println(output);
        /*
         * Howdy there partner!
         */
        lambdaExpressions(input);
        /*
         * Howdy there partner!
         */
    }
    public static void lambdaExpressions(String input) {
        UnaryOperator<String> titleCase = (String s) -> s.length() == 0 ? "" : s.substring(0, 1).toUpperCase() + s.substring(1);
        UnaryOperator<String> exclamationMark = (String s) -> s + "!";
        Function<String, String> pipeline = titleCase.andThen(exclamationMark);
        String output = pipeline.apply(input);
        System.out.println(output);
    }
}

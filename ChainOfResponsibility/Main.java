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
    }
}

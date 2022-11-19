package Template;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Baker extends Processor {
    public void start() {
        new ArrayList(Arrays.asList(
        "Preheat oven",
            "Gather recipe books",
            "Prepare ingedients"))
        .stream()
        .forEach(System.out::println);
    }
    public void work() {
        new ArrayList(Arrays.asList(
        "Chop ingredients",
            "Mix ingredients",
            "Place ingredients in a cooking container"))
        .stream()
        .forEach(System.out::println);
    }
    public void finish() {
        new ArrayList(Arrays.asList(
        "Place cooking containers in oven",
            "Set baking timer",
            "Remove from oven and let cooking container cool down",
            "Place food onto plates on the dinner table",
            "Ring dinner bell"))
        .stream()
        .forEach(System.out::println);
    }
}

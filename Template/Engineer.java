package Template;

import java.util.ArrayList;
import java.util.Arrays;

public class Engineer extends Processor {
    public void start() {
        new ArrayList(Arrays.asList(
            "Analyze requirements",
            "Architect software design",
            "Create UML class + sequence diagrams"))
        .stream()
        .forEach(System.out::println);
    }
    public void work() {
        new ArrayList(Arrays.asList(
            "Create boilerplate code",
            "Develop implementation",
            "Test to validate expected behavior"))
        .stream()
        .forEach(System.out::println);
    }
    public void finish() {
        new ArrayList(Arrays.asList(
            "Fix linting errors",
            "Create CL and assign reviews",
            "Request code review",
            "Address code review feedback",
            "Commit software changes"))
        .stream()
        .forEach(System.out::println);
    }
}

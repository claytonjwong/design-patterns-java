package ChainOfResponsibility;

public abstract class ProcessingObject<T> {
    protected ProcessingObject<T> successor;
    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }
    public T handle(T input) {
        T output = handleWork(input);
        if (successor != null) {
            return successor.handle(output);
        }
        return output;
    }
    abstract protected T handleWork(T input);
}

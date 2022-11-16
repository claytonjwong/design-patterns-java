package Template;

public abstract class Processor {
    public void process() {
        start();
        work();
        finish();
    }
    public abstract void start();
    public abstract void work();
    public abstract void finish();
}

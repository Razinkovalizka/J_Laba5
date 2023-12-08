package main.workspace;
import main.workspace.examples.SomeBean;

public class Main {
    public static void main(String[] args) {
        ((SomeBean) (Injector.inject(new SomeBean()))).foo();
    }
}

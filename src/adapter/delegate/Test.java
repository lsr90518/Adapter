package adapter.delegate;

/**
 * Created by Lsr on 10/13/14.
 */
public class Test {
    public static void main(String[] args){
        Machine machine = new Assembly("500V");
        machine.useValveStandard();
        machine.useValveIncorrectly();
    }
}

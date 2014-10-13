package adapter.inheritance;

/**
 * Created by Lsr on 10/13/14.
 */
public class Assembly extends ValveConfig implements Machine {

    public Assembly(String pressure) {
        super(pressure);
    }

    @Override
    public void useValveStandard() {
        usedAtStandardConfig();
    }

    @Override
    public void useValveIncorrectly() {
        usedAtUnmoral();
    }
}

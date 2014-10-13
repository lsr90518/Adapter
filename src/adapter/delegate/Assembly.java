package adapter.delegate;

/**
 * Created by Lsr on 10/13/14.
 */
public class Assembly extends Machine {

    private ValveConfig valveConfig;

    public Assembly(String pressure){
        this.valveConfig = new ValveConfig(pressure);
    }

    @Override
    public void useValveStandard() {
        this.valveConfig.usedAtStandardConfig();

    }

    @Override
    public void useValveIncorrectly() {
        this.valveConfig.usedAtUnmoral();
    }
}

package adapter.delegate;

/**
 * Created by Lsr on 10/13/14.
 */
public class ValveConfig {
    private String pressure;
    public ValveConfig(String pressure){
        this.pressure = pressure;
    }

    public void usedAtStandardConfig(){
        pressure = "100V";
        System.out.println(pressure);
    }

    public void usedAtUnmoral(){
        pressure = "200V";
        System.out.println(pressure);
    }
}

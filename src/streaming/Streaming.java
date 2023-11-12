package streaming;
import interfaces.Control;
import java.util.ArrayList;

public abstract class Streaming implements Control {
    
    protected String holder;
    protected Integer numberOfSeries;
    protected ArrayList<String> mostWatched;

    public Streaming(String holder) {
        this.holder = holder;
    }

    @Override
    public boolean turnOn() { return true;}

    @Override
    public void watch(String serie) {}

    @Override
    public void changeSerie(String serie1, String serie2) {}

    @Override
    public void turnOff() {}

    public String getName() {
        return holder;
    }

    public void setName(String name) {
        this.holder = name;
    }

    public Integer getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(Integer numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    public ArrayList<String> getMostWatched() {
        return mostWatched;
    }
}
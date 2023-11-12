package streaming;

import java.util.ArrayList;

public class Netflix extends Streaming {

    private boolean turnedOn;

    public Netflix(String holder) {
        super(holder);
    }
    
    @Override
    public boolean turnOn() {
        System.out.printf("Turning on netflix, on %s's account\n", holder);
        return turnedOn = true;
    }

    @Override
    public void watch(String serieName) {
        if (turnedOn == true) {
            System.out.printf("Are you ready to watch %s? \n", serieName);
        } else {
            System.out.println("You may turn on netflix to watch a serie\n");
        }
    }

    @Override
    public void changeSerie(String serie1, String serie2) {
        if (turnedOn == true) {
            System.out.printf("Changing from %s to %s\n", serie1, serie2);
        } else {
            System.out.println("You may turn on netflix to change series\n");
        }
        
    }

    @Override
    public void turnOff() {
        if (turnedOn == true) {
            System.out.printf("Turning off netflix on %s's account\n", holder);
        } else {
            System.out.println("Your netflix is already turned off\n");
        }
        
    }

    @Override
    public ArrayList<String> getMostWatched() {
        ArrayList<String> mostWatched = new ArrayList<>();
        mostWatched.add("The witcher");
        mostWatched.add("The hundred");
        mostWatched.add("Stranger things");
        System.out.println("The most netflix series watched are: ");
        for (String s: mostWatched) {
            System.out.println(s);
        }
        return mostWatched;
    }
}

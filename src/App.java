import streaming.Netflix;

public class App {
    public static void main(String[] args) throws Exception {
        
        Netflix netflix1 = new Netflix("Gabriel");

        netflix1.turnOn();
        netflix1.changeSerie("La casa de papel", "Peaky blinders");
        netflix1.watch("The witcher");
        netflix1.getMostWatched();
    }
}

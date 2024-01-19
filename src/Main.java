import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GameLoader loader = new CsvFileLoader(new File("dato.csv"));
        List<Game> games = loader.load();
        Map<String,Integer> result = new GameProcessor().process(games);

        for (String key: result.keySet()){
            System.out.println(key + " : " + result.get(key));
        }
    }
}
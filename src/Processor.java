import java.util.List;
import java.util.Map;

public interface Processor {
    Map<String, Integer> process(List<Game> games);
}

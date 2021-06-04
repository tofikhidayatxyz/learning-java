package recursive;

import java.util.ArrayList;

public class Name {
    public static ArrayList<String> generateName(String text,
                                                 Integer currentLoop,
                                                 Integer maxLoop,
                                                 ArrayList<String> results) {
        if(currentLoop == maxLoop) {
            return results;
        } else {
            results.add(text);
            return generateName(text, currentLoop + 1, maxLoop, results);
        }

    }
}

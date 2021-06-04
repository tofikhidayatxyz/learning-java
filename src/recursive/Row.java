package recursive;

import java.util.ArrayList;

public class Row {

    public static ArrayList<Integer> makeRows(Integer baseNumber,
                                              Integer currentNumber,
                                              Integer currentLoop,
                                              Integer maxLoop,
                                              ArrayList<Integer> results) {
        if(currentLoop == maxLoop) {
            return results;
        } else {
            if(currentLoop == 0) {
                results.add(currentNumber);
            }
            currentNumber = currentNumber + baseNumber;
            results.add(currentNumber);
            return makeRows(baseNumber, currentNumber, currentLoop + 1, maxLoop, results);
        }
    }
}

package recursive;

import java.util.ArrayList;

public class Fibonaci {

    static final Integer initialNumber = 1;

    public static ArrayList<Integer> makeFibonaci(Integer startNumber,
                                                  Integer currentNumber,
                                                  Integer currentLoop,
                                                  Integer maxLoop,
                                                  ArrayList<Integer> results) {
        if(currentLoop == maxLoop) {
            return results;
        } else {
            Integer lastNumber = currentNumber;
            currentNumber = currentNumber + startNumber;
            results.add(currentNumber);
            if(currentNumber < initialNumber) {
                lastNumber = initialNumber;
            }
            return makeFibonaci(lastNumber, currentNumber, currentLoop + 1, maxLoop, results);
        }
    }
}

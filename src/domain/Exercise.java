package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Static class for most repeated number in array calculation
 * @author Ivan Shapovalov
 */
public class Exercise {
    /**
     * Method that find the most repeated number in array
     * @param array array where to find number
     * @return most repeated number in given array
     */
    public static Long Calculate(long[] array){
        if(array.length == 0) {
            return null;
        }
        
        Arrays.sort(array);
        
        List<Pair> list = new ArrayList<Pair>();
        list.add(new Pair(array[0]));
        list.add(new Pair(array[0]));
        
        for (long number : array) {
            Pair prevElement = (list.get(0));
            
            if(prevElement.number != number) {
                Pair resultElement = list.get(1);
                if(prevElement.count >= resultElement.count) {
                    resultElement.reset(prevElement.number, prevElement.count); 
                }
                (list.get(0)).reset(number, 0);
                continue;
            }
            
            prevElement.count += 1;
        }
        
        return (list.get(1)).number;
    }
}

import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(char c : str.toCharArray()){
            m.put(c, m.getOrDefault(c, 0) +1);
        }
        char mc = '\0';
        int count = 0;
        for(char c : m.keySet()){
            if(m.get(c) > count){
                mc = c;
                count = m.get(c);
            }
        }
        return mc;
    }
}

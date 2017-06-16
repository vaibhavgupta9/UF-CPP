import java.util.HashMap;
import java.util.Map;

/**
 * Created by chris on 6/15/17.
 * O(n) time, O(n) space.
 */
public class ChrisTwoPointerSolution implements Solution {
    @Override
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length() || t.length() == 0) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {// init substring map
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        int len = Integer.MAX_VALUE, minHead = 0, counter = t.length();

        for (int start = 0, end = 0; end < s.length(); end++) {// start from end pointer
            char cs = s.charAt(end);
            if (map.containsKey(cs)) {
                if (map.get(cs) > 0) counter--;
                map.put(cs, map.get(cs) - 1);
            }

            while (counter == 0) { // until find a valid window
                if (end - start + 1 < len) { // if the window size is less than prev min, replace
                    len = end - start + 1;
                    minHead = start;
                }
                char ce = s.charAt(start);
                if (map.containsKey(ce)) {
                    // if reach a char contained in dict and that char is just exact valid, i.e. in map 'c' count is 0
                    // increase the counter, which means start removed a char from valid window, end pointer need to
                    // reach another char to make to window valid again
                    if (map.get(ce) == 0) counter++;
                    map.put(ce, map.get(ce) + 1);
                }
                start++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(minHead, minHead + len);

    }
}

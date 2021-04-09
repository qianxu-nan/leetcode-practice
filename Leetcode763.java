
import java.util.ArrayList;
import java.util.List;

public class Leetcode763 {
    public static List<Integer> partitionLabels(String s) {
        int[] position = new int[26];
        for (int i = 0; i < s.length(); i++) {
            position[s.charAt(i) - 'a'] = i;
        }
        int left_pointer = 0;
        int max = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, position[s.charAt(i) - 'a']);
            if (i == max) {
                result.add(max - left_pointer + 1);
                left_pointer = max + 1;
            }
        }
        return result;
    }
}

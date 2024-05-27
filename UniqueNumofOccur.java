import java.util.Hashtable;
import java.util.Set;
import java.util.HashSet;


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int num : arr) {
            if (table.containsKey(num)) {
                table.put(num, table.get(num) + 1);
            }
            else {
                table.put(num, 1);
            }
        }

        Set<Integer> set = new HashSet<>(table.values());

        return table.size() == set.size();
    }
}

import Algorithm.AlgoMath;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            if (cnt.merge(x, 1, Integer::sum) > 2) { // ++cnt[x] > 2
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] nums = new int[]{1, 1, 2, 2, 3, 4};
        System.out.println(s.isPossibleToSplit(nums));
        
        var vec = new int[]{1, 1, 1, 1};
        System.out.println(s.isPossibleToSplit(vec));
        
        AlgoMath algo = new AlgoMath();
        System.out.println(algo.comb(10, 2));
    }
}
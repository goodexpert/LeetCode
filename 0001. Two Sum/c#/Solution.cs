public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var diff = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++) {
            int value = nums[i];
            int found = target - value;

            if (diff.ContainsKey(found)) {
                return [diff[found], i];
            }
            diff[value] = i;
        }
        return [-1, -1];
    }
}

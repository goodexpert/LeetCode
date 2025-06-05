class Solution {
    public int[] twoSum(int[] nums, int target) {
        var diff = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var value = nums[i];
            var found = target - nums[i];

            if (diff.containKey(found)) {
                return new int[] {diff.get(found), i};
            }
            diff.put(value, i);
        }
        return new int[] {-1, -1};
    }
}

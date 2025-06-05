class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> diff;

        for (int i = 0; i < nums.size(); i++) {
            int value = nums[i];
            int found = target - value;

            if (diff.count(found)) {
                return {diff[found], i};
            }
            diff[value] = i;
        }
        return {-1, -1};
    }
};

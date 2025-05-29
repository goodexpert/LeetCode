class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int numSize = nums.size();
        vector<int> result = { -1, -1 };

        for (int i = 0; i < numSize - 1; i++) {
            for (int j = i + 1; j < numSize; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
};

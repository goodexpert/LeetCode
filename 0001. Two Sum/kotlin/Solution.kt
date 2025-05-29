class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(-1, -1)

        for (i in 0 until nums.count() - 1) {
            for (j in i + 1 until nums.count()) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                    return result
                }
            }
        }
        return result
    }
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diff = HashMap<Int, Int>()

        for (i in 0 until nums.count()) {
            val value = nums[i]
            val found = target - value

            diff.get(found)?.let {
                return intArrayOf(it, i)
            }
            diff.put(value, i)
        }
        return intArrayOf(-1, -1)
    }
}

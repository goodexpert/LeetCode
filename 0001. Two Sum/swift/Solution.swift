class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var result = Array(repeating: -1, count: 2)

        for i in 0 ..< nums.count - 1 {
            for j in i + 1 ..< nums.count {
                if nums[i] + nums[j] == target {
                    result[0] = i
                    result[1] = j
                    return result
                }
            }
        }
        return result
    }
}

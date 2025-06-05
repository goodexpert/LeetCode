class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var diff: [Int:Int] = [:];

        for i in 0 ..< nums.count {
            let value = nums[i]
            let found = target - value

            guard let index = diff[found] else {
                diff[value] = i
                continue
            }
            return [index, i]
        }
        return [-1, -1]
    }
}

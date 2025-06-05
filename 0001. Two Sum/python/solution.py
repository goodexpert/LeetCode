class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = {}

        for i, value in enumerate(nums):
            found = target - value

            if found in diff:
                return [diff[found], i]

            diff[value] = i

        return [-1, -1]

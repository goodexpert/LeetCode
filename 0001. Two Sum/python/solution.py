class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        M = len(nums)
        R = [-1, -1]

        for i in range(M - 1):
            for j in range(i + 1, M):
                if nums[i] + nums[j] == target:
                    R[0] = i
                    R[1] = j
                    return R

        return R

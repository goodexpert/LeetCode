function twoSum(nums: number[], target: number): number[] {
  let result = Array(2).fill(-1);

  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        result[0] = i;
        result[1] = j;
        return result;
      }
    }
  }
  return result;
};

function twoSum(nums: number[], target: number): number[] {
  let diff = new Map<number, number>();

  for (let i = 0; i < nums.length; i++) {
    const value = nums[i];
    const found = target - value;
    const matched = diff.get(found);

    if (matched != undefined) {
        return [matched, i];
    }
    diff.set(value, i);
  }
  return [-1, -1];
};

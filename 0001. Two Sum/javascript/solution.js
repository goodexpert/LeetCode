/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  const diff = new Map();

  for (var i = 0; i < nums.length; i++) {
    const value = nums[i];
    const found = target - value;

    if (diff.has(found)) {
        return [diff.get(found), -1];
    }
    diff.set(value, i);
  }
  return [-1, -1];
};

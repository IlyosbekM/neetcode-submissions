class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (numbers.containsKey(find)) {
                return new int[] {numbers.get(find), i};
            }
            numbers.put(nums[i], i);
        }
        return null;
    }
}

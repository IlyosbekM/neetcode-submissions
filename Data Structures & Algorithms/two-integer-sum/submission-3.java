class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int find = target - num;
            if (numbers.containsKey(find)) {
                return new int[] {
                    numbers.get(find), i
                };
            }
            numbers.put(num, i);

        }
        return null;
    }
}

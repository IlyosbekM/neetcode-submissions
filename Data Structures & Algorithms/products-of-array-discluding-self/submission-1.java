class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int zeroCount = 0;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                idx = i;

            } else
                sum *= nums[i];
            if (zeroCount > 1)
                return new int[nums.length];
        }
        int[] rs = new int[nums.length];
        if (idx != -1) {
            rs[idx] = sum;
            return rs;
        }
        for (int i = 0; i < nums.length; i++) {
            rs[i] = sum / nums[i];
        }

        return rs;
    }
}

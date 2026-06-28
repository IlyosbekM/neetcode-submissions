class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] rs = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            rs[i]=nums[i];
            rs[rs.length/2+i]=nums[i];
        }
        return rs;
    }
}
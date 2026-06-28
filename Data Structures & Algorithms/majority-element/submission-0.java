class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int max = -1;
        int ans=0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> rs : map.entrySet()) {
            if (rs.getValue() > max) {
                max = rs.getValue();
                ans=rs.getKey();
            }
        }

        return ans;
    }
}
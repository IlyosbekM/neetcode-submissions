class Solution {
      public  int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((b, a) -> a.getValue().compareTo(b.getValue()));

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}

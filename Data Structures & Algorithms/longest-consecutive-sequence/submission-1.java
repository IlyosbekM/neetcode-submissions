class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int n : nums) {
            set.add(n);
        }

        int maxLongest = 0;

        for (int n : set) {
            int count=1;
            while (set.contains(n + 1)) {
                count++;
                n++;
            }

            if(count>maxLongest){
                maxLongest=count;
            }
        }
        System.out.println(set);

        return maxLongest;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        int lens = s.length();
        int lent = t.length();

        if (lens != lent)
            return false;

        int[] counter = new int[26];

        for (int i = 0; i < lens; i++) {
            int idx = s.charAt(i) - 'a';
            int idx2 = t.charAt(i) - 'a';
            counter[idx]++;
            counter[idx2]--;
        }
        for (int n : counter) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}

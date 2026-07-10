class Solution {
    public int lengthOfLastWord(String s) {
        String[] w = s.trim().split("\\s+");
        // System.out.println(Arrays.toString(w));
        System.out.println(w[w.length-1]);

        for (int i = w.length; i >= 0; i--) {
            return w[i-1].length();
        }
        return 0;
    }
    }

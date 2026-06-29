class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder rs = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return rs.toString();
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return new String(rs);
                }
            }
            rs.append(strs[0].charAt(i));
        }
        return new String(rs);
    }
}


class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String word : strs) {
            sb.append(word.length());
            sb.append("!");
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p2 != str.length()) {
            if (str.charAt(p2) != '!') {
                p2++;
                continue;
            }

            int wordSize = Integer.valueOf(str.substring(p1, p2));
            res.add(str.substring(p2 + 1, p2 + wordSize + 1));

            p2 = p2 + wordSize + 1;
            p1 = p2;
        }

        return res;
    }
}
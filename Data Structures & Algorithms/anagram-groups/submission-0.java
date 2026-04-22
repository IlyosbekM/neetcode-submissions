
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        List<String> source = Arrays.asList(strs);
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < source.size(); i++) {

            if (seen.contains(source.get(i))) {
                continue;
            }

            List<String> temp = new ArrayList<>();
            String current = source.get(i);

            seen.add(current);
            temp.add(current);

            for (int j = i + 1; j < source.size(); j++) {

                if (compare(current, source.get(j))) {
                    String val = source.get(j);
                    seen.add(val);
                    temp.add(val);
                }
            }

            res.add(temp);
        }

        return res;
    }

    private boolean compare(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
            arr[str2.charAt(i) - 'a']--;
        }

        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
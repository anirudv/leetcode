class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = result.length();
            if (c == '*') {
                if (len > 0  && result.charAt(len - 1) != '*') {
                    result.deleteCharAt(len - 1);
                }
            }
            else {
                result.append(c);
            }


            }
            return result.toString();
        }




}

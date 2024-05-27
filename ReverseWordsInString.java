class Solution {
    public String reverseWords(String s) {

        s = s.trim();
        
        String[] array = s.split("\\s+");

        ArrayList<String> wordList = new ArrayList<String>();

        for (String word: array) {
            wordList.add(word);
        }

        ArrayList<String> rever = new ArrayList<String>();



        Collections.reverse(wordList);

        String reversed = String.join(" ", wordList);

        return reversed;
    }
}


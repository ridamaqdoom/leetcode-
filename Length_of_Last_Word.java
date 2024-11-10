class Solution {
    public int lengthOfLastWord(String s) {
        // Remove the space from the words 
        s = s.trim();
        // Split the string by spaces
        String[] returning_word = s.split(" ");
        // Return the length of last element.
        return returning_word[returning_word.length-1].length();
    
    }
}

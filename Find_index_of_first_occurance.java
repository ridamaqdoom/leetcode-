class Solution {
    public int strStr(String haystack, String needle) {
        // length of needle 
        int x = needle.length();
        // length of haystack 
        int y = haystack.length();
       //check each substring of equal length to needle.
       // when substring haystack macthes needle retuen index i
        for (int i=0; i<=y-x; i++){
            if (haystack.substring(i,i+x).equals(needle)){
                return i;
                }}
        //else reurn -1
        return -1;
            }
        
}
        
    


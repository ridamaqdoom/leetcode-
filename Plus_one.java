
class Solution {
    public int[] plusOne(int[] digits) {
        int[] dummy = new int[digits.length+1];
        dummy[0] = 1;
        for(int i = digits.length -1; i >=0; i--){
            // If we add 1 to the last index, the number at the last index will be 0 then we have carry. Again if we add the carry to the index 0, the number at index 0 will be 0, then we will get another carry.  
            if(digits[i]+1 != 10){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        return dummy;
        
    }
}

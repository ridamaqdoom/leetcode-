class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = ""
        sum = 0
        for i in range(len(s)):
            for j in range(i,len(s)):
                string = s[i:j+1]
                if string == string[::-1]:
                    if len(string) > len(result):
                        result = string
                    
        return result


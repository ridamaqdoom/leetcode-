class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # create an empty set to store the result values
        result = set()
        # we do soting to make the traversal easy 
        nums.sort()

        # Sort throgh the integers 
        #fixed i at index 0 and itearte over j and k 
        for i in range(len(nums)):
            # fixed j at index i +1 and iterate over k
            for j in range(i+1, len(nums)):
                # fixed k at index j+1 and iterate 
                for k in range(j+1, len(nums)):
                    if nums[i] + nums [j] + nums[k] == 0:
                        # add the values to result if sum is 0
                        result.add((nums[i], nums[j], nums[k])) 
        return [ i for i in result]                   


# Approach

# Sort the array to simplify duplicate handling.
# Use a hash map to quickly check if the required third element exists.
# Avoid duplicates by moving pointers to unique elements after finding a valid triplet.
# Return the triplets after collecting all valid ones.

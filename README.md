21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

My solution firstly create a dummy list with the current item pointing to the dummmy item, we then check we the list are not empty if so if check if list1.val is less then list2.val if statisfy the if statement add to the new created list, else if list2.val is less that list1.val add it as the next element of the list. once add point the current item to the next itme of the list.

Lastly if list1 is empty return list2 or if list2 is empty return list 1.

--------------------------------------------------------------------------------------------------------

Question 28. Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


My solution:

Calculate the lengths of haystack and needle.
Iterate through haystack up to the index where a substring could match needle (i.e., up to len(haystack) - len(needle) + 1).
For each starting index, check if the substring from this index matches needle.
If a match is found, return the current index.
If no match is found by the end, return -1
--------------------------------------------------------------------------------------------------------


35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

My Solution:

We initialize two pointers, left and right. left starts at the beginning of the list (0), and right starts at the end of the list (len(nums) - 1). These pointers help in performing the binary search.

Calculate the middle index mid of the current range defined by left and right. The // operator performs integer division.

If the element at the midpoint (nums[mid]) is greater than the target, it means the target must be in the left half of the current range. We adjust the right pointer to mid - 1 to narrow the search to the left half.

If the element at the midpoint (nums[mid]) is less than the target, it means the target must be in the right half of the current range. We adjust the left pointer to mid + 1 to narrow the search to the right half.


If the target is not found in the list, the while loop will terminate when left is greater than right. At this point, left will be the index where the target should be inserted to maintain the sorted order. We return left as the insertion point.


--------------------------------------------------------------------------------------------------------





Question 58: Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 My solution is easy approch to the problem
  . Step 1: trim the string to remove any trailing space from the string to avoid counting them as part of last word.
  . Step 2: split the string by spaces to get each word as an element in a list.
  . Step 3: Return the Length of the Last Word.


  --------------------------------------------------------------------------------------------------------

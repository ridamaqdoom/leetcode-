21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

My solution firstly create a dummy list with the current item pointing to the dummmy item, we then check we the list are not empty if so if check if list1.val is less then list2.val if statisfy the if statement add to the new created list, else if list2.val is less that list1.val add it as the next element of the list. once add point the current item to the next itme of the list.

Lastly if list1 is empty return list2 or if list2 is empty return list 1.

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

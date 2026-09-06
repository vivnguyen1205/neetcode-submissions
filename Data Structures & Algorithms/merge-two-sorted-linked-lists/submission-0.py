# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        tail = dummy 
        while list1 and list2: #iterate through lists 
            if list1.val < list2.val: 
                tail.next = list1 # add list1 
                list1 = list1.next # move to next node in l1

            else: #if list2< list1 
                tail.next = list2 # add list2
                list2 = list2.next # move to next node in l2
            tail = tail.next # move down the list
        if list1: # if list1 if longer than l2
            tail.next = list1
        elif list2: # if list2 is longer than l1
            tail.next = list2
        return dummy.next # return the linked list starting at dummy.next
        
            
            

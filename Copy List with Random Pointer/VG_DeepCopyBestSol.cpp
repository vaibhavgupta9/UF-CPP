/**
 * Definition for singly-linked list with a random pointer.
 * struct RandomListNode {
 *     int label;
 *     RandomListNode *next, *random;
 *     RandomListNode(int x) : label(x), next(NULL), random(NULL) {}
 * };
 */

class Solution {
public:
    RandomListNode *copyRandomList(RandomListNode *head) {
        RandomListNode *curr=head;
        RandomListNode *copyCurr;
        
        while(curr)
        {
            RandomListNode *temp=new RandomListNode(curr->label);
            
            temp->next=curr->next;
            curr->next=temp;
            
            curr=temp->next;
        }
        curr=head;
        copyCurr=head;
        
        while(curr)
        {
            copyCurr=curr->next;
            
            if(curr->random==NULL)
            {
                copyCurr->random=NULL;
            }
            else
            {
                RandomListNode *temp=curr->random;
                temp=temp->next;
                
                copyCurr->random=temp;
            }
            
            curr=curr->next->next;
        }
        
        curr=head;
        RandomListNode *retHead=new RandomListNode(0);    //dummy head
        copyCurr=retHead;
        
        while(curr)
        {
            copyCurr->next=curr->next;
            copyCurr=copyCurr->next;
            
            curr->next=curr->next->next;
            
            curr=curr->next;
        }
        curr=retHead;
        retHead=retHead->next;
        delete curr;
        
        return retHead;
    }
};
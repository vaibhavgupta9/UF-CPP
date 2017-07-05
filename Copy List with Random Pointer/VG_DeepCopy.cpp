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

    	if(!head)
    		return NULL;
    		
    	RandomListNode *retHead=new RandomListNode(0);

    	RandomListNode *curr=head;
    	RandomListNode *newCurr=retHead;

    	map<RandomListNode*,int> currMap;
    	map<int, RandomListNode*> newCurrMap;

    	int index=1;

    	while(curr)
    	{
    	    //cout<<"got here0"<<endl;
    		RandomListNode *temp=new RandomListNode(curr->label);

    		currMap[curr]=index;
    		newCurrMap[index]=temp;
    		index++;

    		newCurr->next=temp;
    		newCurr=temp;

    		curr=curr->next;    		
    	}

    	curr=retHead;    	
    	retHead=retHead->next;	//deleting init node
    	delete curr;
    	
    	curr=head;
    	newCurr=retHead;    	

    	while(curr)
    	{    		
    		if(curr->random==NULL)
    			newCurr->random=NULL;
    		else
    		{
    			int randomIndex=currMap[curr->random];
    			newCurr->random=newCurrMap[randomIndex];
    		}    
    		curr=curr->next;
    		newCurr=newCurr->next;
    	}
    	
    	return retHead;

    }
};
class Solution {
public:
    
    void findMatch(string sol, int beginParen, int endParen, vector<string> &retVect)
    {
        if(endParen<beginParen || endParen<0 || beginParen<0) //failed case
            return;
        
        if(endParen==0 && beginParen==0) //solution
        {
            retVect.push_back(sol);
            return;
        }        
        
        findMatch(sol+"(", beginParen-1, endParen, retVect);
        findMatch(sol+")", beginParen, endParen-1, retVect);
        
    }
    
    vector<string> generateParenthesis(int n) {
        
        int endParen=n;
        int beginParen=n;
        
        string sol="";        
        vector<string> retVect;        
        
        findMatch(sol, beginParen, endParen, retVect);
        
        return retVect;
        
    }
};
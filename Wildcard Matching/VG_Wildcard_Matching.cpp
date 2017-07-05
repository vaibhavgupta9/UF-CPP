class Solution {
public:   
    
    bool isMatch(string s, string p) {
        
        vector<vector<bool> > memo(s.size()+1,vector<bool>(p.size()+1,0));   // extra row and col for empty string and pattern
        
        //filling the grid        
        int m=memo.size();
        int n=memo[0].size();
        
        memo[0][0]=1;
        for(int j=1;j<n;j++)
        {
            if(p[j-1]=='*')
                memo[0][j] = memo[0][j-1];
            else
                memo[0][j] = 0;                
        }
        
        for(int i=1;i<m;i++)
        {
            int a=i-1;            
            for(int j=1;j<n;j++)
            {
                int b=j-1;
                if(s[a]==p[b] || p[b]=='?')  //alpha match
                {
                    //diagonal must match to be true
                    memo[i][j] = memo[i-1][j-1];
                }
                else if(p[b]=='*')
                {
                    //2 cases arise: Accept current char in * or reject it(* passes as empty match)
                    //above or previous value in same row must be true to match
                    //everything before including * must match before curr|| everything before, excluding *, and including curr must match
                    memo[i][j]= (memo[i-1][j] || memo[i][j-1]);
                }
                else
                    memo[i][j]=0;
            }
        }
        return memo[m-1][n-1];        
        
    }
};
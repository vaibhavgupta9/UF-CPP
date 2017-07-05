class Solution {
public:

    bool isSafe(vector<vector<char>>& grid, int row, int col)
    {
        if(row>=0 && row<grid.size() && col>=0 && col<grid[0].size() && grid[row][col]=='1')
        {
            return true;
        }
        return false;
    }
    
    void DFS(vector<vector<char>>& grid, int row, int col, vector<vector<bool>>& memo)
    {
        vector<int> vect={-1,0,0,-1,1,0,0,1};
        for(int i=0;i<vect.size();i+=2)
        {
            int x=vect[i] + row;
            int y=vect[i+1] + col;
            
            if(isSafe(grid, x, y) && !memo[x][y])
            {
                memo[x][y]=1;
                DFS(grid, x, y, memo);
            }
        }
    }
    
    int numIslands(vector<vector<char>>& grid) {
        
        if(grid.empty())
            return 0;
            
        vector<vector<bool>> memo(grid.size(),vector<bool>(grid[0].size(),0));
        int counter=0;
        
        
        for(int row=0; row<grid.size(); row++)
        {
            for(int col=0; col<grid[0].size(); col++)
            {
                
                if(isSafe(grid, row, col) && !memo[row][col])
                {
                    memo[row][col]=1;
                    DFS(grid, row, col, memo);
                    counter++;
                }
            }
        }
        return counter;
        
    }
};
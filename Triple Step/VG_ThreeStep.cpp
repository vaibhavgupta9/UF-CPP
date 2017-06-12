/*
A child is running up a staircase with n steps and can hop either 1step, 2 steps, or 3 steps at a time.
Implement a method to count how many possible ways the child can run up the stairs.
*/

#include<iostream>
#include<vector>
using namespace std;

#define DEBUG(x) cout << '>' << #x << ':' << x << endl;

int threeStepWays(int n, vector<int> &memo)
{
    if(n<0)
        return 0;
    else if(n<=1)
        return 1;

    if(!memo[n])
    {
        memo[n]=threeStepWays(n-1, memo) + threeStepWays(n-2, memo) + threeStepWays(n-3, memo);
    }
    return memo[n];
}

int threeStepWaysBottomUp(int n, vector<int> &memo)
{
    memo[0]=1;
    memo[1]=1;
    memo[2]=2;

    for(int i=3;i<=n;i++)
    {
        memo[i]=memo[i-1] + memo[i-2] + memo[i-3];
    }
    return memo[n];
}

int main()
{
    int n=7;
    vector<int> memo(n+1,0);

    cout<<"\nNo. of ways for threeStep stairs, Top-Down: "<<n<<" is "<<threeStepWays(n, memo);
    cout<<"\nNo. of ways for threeStep stairs, Bottom-Up: "<<n<<" is "<<threeStepWaysBottomUp(n, memo);

    return 0;
}


#include<iostream>
#include<vector>
using namespace std;

#define DEBUG(x) cout << '>' << #x << ':' << x << endl;

int fiboRecursively(int x)
{
    if(x<=1)
        return x;
    if(x==2)
        return 1;
    return(fiboRecursively(x-1) + fiboRecursively(x-2));
}

int fiboTopDownHelper(int x, vector<int> &memo)
{
    if(x<=1)
        return x;
    if(memo[x]==0)
        memo[x]= fiboTopDownHelper(x-1, memo) + fiboTopDownHelper(x-2, memo);
    return memo[x];
}

int fiboTopDown(int x)
{
    vector<int> memo(x+1,0);
    return(fiboTopDownHelper(x, memo));
}

int fiboBottomUp(int x)
{
    vector<int> memo(x+1,0);

    memo[0]=0;
    memo[1]=1;

    for(int i=2;i<=x;i++)
    {
        memo[i]=memo[i-1] + memo[i-2];
    }
    return memo[x];
}

int main()
{
    int x=7;
    cout<<"\nFibbonaci number, recursive: "<<x<<" is "<<fiboRecursively(x);
    cout<<"\nFibbonaci number, Top-Down: "<<x<<" is "<<fiboTopDown(x);
    cout<<"\nFibbonaci number, Bottom-Up: "<<x<<" is "<<fiboBottomUp(x);
    cout<<endl;
    return 0;
}


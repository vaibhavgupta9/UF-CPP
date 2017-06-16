/*
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed, the only constraint stopping
you from robbing each of them is that adjacent houses have security system connected
and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.
*/

#include<iostream>
#include<vector>
using namespace std;

#define DEBUG(x) cout << '>' << #x << ':' << x << endl;

int rob(vector<int>& nums)
{
    if(nums.size()==0)
        return 0;
    if(nums.size()==1)
        return(nums[0]);

    vector<int> memo(nums.size()+1, 0);
    memo[0]=nums[0];
    memo[1]=max(nums[0],nums[1]);

    for(int i=2;i<nums.size();i++)
    {
        memo[i]=max(   (memo[i-2] + nums[i]),  (memo[i-1]) );
    }
    return memo[nums.size()-1];
}

int main()
{
    vector<int> nums={1,3,1};

    cout<<"\nTotal loot from houses: "<<rob(nums);
    return 0;
}


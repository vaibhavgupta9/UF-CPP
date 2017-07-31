#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int t;
    cin >> t;
    typedef pair<int,int> ipair;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        int m;
        cin >> n >> m;
        int graph[n][n];
        int distance[n];
        priority_queue<ipair,vector<ipair>,greater<ipair>> pq;
        for(int i=0;i<n;i++)
            distance[i]=INT_MAX;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                graph[i][j]=INT_MAX;
        for(int a1 = 0; a1 < m; a1++){
            int x;
            int y;
            int r;
            cin >> x >> y >> r;
            if(graph[x-1][y-1]>r)
            {graph[x-1][y-1] = r;
                graph[y-1][x-1] = r;}
        }
        int s;
        cin >> s;
        distance[s-1]=0;
        pq.push(make_pair(0,s-1));
        while(!pq.empty())
        {
            int node = pq.top().second;
            int dist = pq.top().first;
           // cout<<node<<" "<<dist<<" ";
            pq.pop();
            for(int i=0;i<n;i++)
            {
                if(graph[node][i]>0 && graph[node][i]!=INT_MAX)
                {
                    //cout<<i<<" "<<distance[i]<<" "<<distance[node]<<" "<<graph[node][i]<<" "<<"\n";
                    if(distance[i]>distance[node]+graph[node][i])
                    {
                        //cout<<i<<"relaxation";
                        distance[i] = distance[node] + graph[node][i];
                        pq.push(make_pair(distance[i],i));
                    }
                }
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(i!=s-1 && distance[i]!=INT_MAX)
                cout<<distance[i]<<" ";
            if(distance[i]==INT_MAX)
                cout<<"-1"<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
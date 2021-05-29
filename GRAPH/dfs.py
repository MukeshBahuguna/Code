#### Written and managed by Mukesh Bahuguna :D

from collections import *

def dfsOfGraph(g,visited,start,path):
    path.append(start)
    visited[start]=True
    for neighbour in g[start]:
        if not visited[neighbour]:
            dfsOfGraph(g, visited,neighbour,path)
    return path

V, E = map(int, input().split())
g=defaultdict(list)
for _ in range(E):
    u, v = map(int, input().split())
    g[u].append(v)
    g[v].append(u)

start=0
path=[]
visited=defaultdict(bool)
ans=[]
for i in range(0,V):
    if not visited[i]:
        ans+= dfsOfGraph(g,visited,start,path)
print(ans)

#OR using adjacency matrix

def dfsOfGraph(adj_mat,visited2,start,path):
    path.append(start)
    visited2[start]=True
    for i in range(len(visited2)):# or number of vert(V)
        if adj_mat[start][i]>0 and not visited2[i]:
            dfsOfGraph(adj_mat,visited2,i,path)
    return path

V, E = map(int, input().split())
adj_mat=[[0 for i in range(V)] for j in range(V)]
for _ in range(E):
    u, v = map(int, input().split())
    adj_mat[u][v]=1
    adj_mat[v][u]=1

start=0
path=[]
#visited=defaultdict(bool) # or a list
visited2=[False]*V #purpose same as above but this is a lists
ans=[]
for i in range(0,V):
    if not visited2[i]:
        ans+= dfsOfGraph(adj_mat,visited2,start,path)
print(ans)

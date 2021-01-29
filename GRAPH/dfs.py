#### Written and managed by Mukesh Bahuguna :D

from collections import *

def dfsOfGraph(g,visited,start,path):
    path.append(start)
    print(path)
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
ans = dfsOfGraph(g,visited,start,path)
print(ans)

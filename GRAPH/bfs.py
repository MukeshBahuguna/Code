from collections import * 
def bfsOfGraph(adj_mat,visited2,start,path):
    q=[start]
    path=[start]
    visited2[start]=1
    while q:
        a=q.pop(0)
        for i in range(len(visited2)): # len(visited)=number of vertices
            if adj_mat[a][i]>0 and not visited2[i]:# check every connection of a with all other vertices
                q.append(i) # as it's an undirected graph so omiting that edge's vertex which has already been added!
                path.append(i)
                visited2[i]=True     
    return path

# Using adj_matrix
V, E = map(int, input().split())
adj_mat=[[0 for i in range(V)] for j in range(V)]
for _ in range(E):
    u, v = map(int, input().split())
    adj_mat[u][v]=1
    adj_mat[v][u]=1
start=0
path=[]
#visited=defaultdict(bool)
visited2=[False]*V #purpose same as above but this is a list.
ans=[]
for i in range(0,V):
    if not visited2[i]:
        ans += bfsOfGraph(adj_mat,visited2,start,path)
print(ans)
#########################################  use above part as main OR the below one

def bfsOfGraph(g,N,start):
    # code here
    arr=[start]
    q=deque([start])
    visited=[False]*N
    while q:
        t=q.popleft()
        for x in g[t]:
            if not visited[x]:
                arr.append(x)
                q.append(x)
            visited[x]=True    
    return arr
##################using dict as graph 
V, E = map(int, input().split())
g=defaultdict(list)
for _ in range(E):
    u, v = map(int, input().split())
    g[u].append(v)
print(g)
start=0
ans = bfsOfGraph(g,V,start)
print(*ans)
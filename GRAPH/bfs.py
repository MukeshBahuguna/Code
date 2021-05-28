def bfsOfGraph(adj_mat,visited2,start,path):
    q=[start]
    path=[start]
    while q:
        a=q.pop(0)
        for i in range(start,len(visited2)): # len(visited)=number of vertices
            if adj_mat[a][i]>0 and not visited2[i]:# check every connection of a with all other vertices
                q.append(i)
                if i not in path: # as it's an undirected graph so omiting that edge's vertex which has already been added!
                    path.append(i)
                visited2[i]=True     
    return path


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
ans = bfsOfGraph(adj_mat,visited2,start,path)
print(ans)

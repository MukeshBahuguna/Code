###################### Using BFSn 

def bfsOfGraph(adj_mat,visited2,start,v2,path):
    q=[start]
    path=[start]
    visited2[start]=1
    while q:
        a=q.pop(0)
        for i in range(len(visited2)): # len(visited)=number of vertices
            if adj_mat[a][i]>0 and not visited2[i]:# check every connection of a with all other vertices
                q.append(i)
                if i==v2:
                    return True
                visited2[i]=True     
    return False


V=int(input())
E=int(input())

adj_mat=[[0 for i in range(V)] for j in range(V)]
for _ in range(E):
    u, v ,k= map(int, input().split())
    adj_mat[u][v]=1
    adj_mat[v][u]=1
start=0
path=[]

v1=int(input())
v2=int(input())

#visited=defaultdict(bool)
visited2=[False]*V #purpose same as above but this is a list.

ans=bfsOfGraph(adj_mat,visited2,start,v2,path)
print(ans)

####################### Using DFS
def dfsOfGraph(adj_mat,visited2,start,v2,path):
    path.append(start)
    if start==v2:
        return True
    visited2[start]=True
    for i in range(len(visited2)):# or number of vert(V)
        if adj_mat[start][i]>0 and not visited2[i]:
            dfsOfGraph(adj_mat,visited2,i,v2,path)
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
v1,v2=map(int,input().split())

ans=dfsOfGraph(adj_mat,visited2,v1,v2,path)
print(True) if v2 in ans else print(False)
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
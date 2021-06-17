# ############# Noob version

# def dfsOfGraph(adj_mat,visited2,start,v2,path):
#     if start==v2:
#         return path
#     visited2[start]=True
#     for i in range(len(visited2)):# or number of vert(V)
#         if adj_mat[start][i]>0 and not visited2[i]:
#             path[i]=start
#             print(start,i)
#             dfsOfGraph(adj_mat,visited2,i,v2,path)
        
#     return path

# V, E = map(int, input().split())
# adj_mat=[[0 for i in range(V)] for j in range(V)]
# for _ in range(E):
#     u, v = map(int, input().split())
#     adj_mat[u][v]=1
#     adj_mat[v][u]=1

# start=0
# path={}
# #visited=defaultdict(bool) # or a list
# visited2=[False]*V #purpose same as above but this is a lists
# ans=[]
# v1,v2=map(int,input().split())
# print(v1,v2)

# ans=dfsOfGraph(adj_mat,visited2,v1,v2,path)
# print(ans)
# g_path=[v2]
# ele=v2
# for i in ans:
#     if ans.get(ele) is not None:
#         g_path.append(ans[ele])
#         ele=ans[ele]
#     else:
#         break
# print(g_path)

################## Better / multipurpose version

class Solution:
    c=0 #static var
    def dfsOfGraph(self,adj_mat,visited2,start,v2,path):
        visited2[start]=True 
        path.append(start)
        if start==v2:
            print(path)
            self.c+=1
        else:
            for i in range(len(visited2)):# or number of vert(V)
                if adj_mat[start][i]>0 and not visited2[i]:
                    self.dfsOfGraph(adj_mat,visited2,i,v2,path)
        path.pop()
        visited2[start]=False

        
if __name__ == '__main__':
    ob=Solution()
    V, E = map(int, input().split())
    adj_mat=[[0 for i in range(V)] for j in range(V)]
    for _ in range(E):
        u, v = map(int, input().split())
        adj_mat[u][v]=1
        
    visited2=[False]*V
    path=[]
    v1,v2=map(int,input().split())
    ans=ob.dfsOfGraph(adj_mat,visited2,v1,v2,path)
    print(ob.c)
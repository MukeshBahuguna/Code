from typing import List
from collections import deque


def isNotVisited(x: int, path: List[int]) -> int:
    size = len(path)
    for i in range(size):
        if (path[i] == x):
            return 0     
    return 1
 

def findpaths(g: List[List[int]], src: int,
              dst: int, v: int) -> None:
                   
    q = deque()
    path = [src]
    q.append(path[:])
     
    while q:        
        path = q.popleft()
        print(path)
        last = path[len(path) - 1]
        print(last)

        if (last == dst):
            print(path)
        
        for i in range(len(g[last])):
            if (isNotVisited(g[last][i], path)):
                newpath = path.copy()
                newpath.append(g[last][i])
                q.append(newpath)
 
# Driver code
if __name__ == "__main__": 
    # Number of vertices
    v = int(input())
    g = [[] for _ in range(v)]
 
    # Construct a graph
    for i in range(v):
        a,b=map(int,input().split())
        g[a].append(b)
        g[b].append(a)
    print(g)
    src = 2
    dst = 3
    findpaths(g, src, dst, v)
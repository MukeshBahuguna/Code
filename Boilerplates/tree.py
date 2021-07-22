# A Binary Tree Node
class Node:
	# A constructor to create new tree node
	def __init__(self, key):
		self.key = key
		self.left = None
		self.right = None
    

def bfs(node):
    if node is None:
        return []
    q=[node]
    a=[]
    
    while len(q):
        x=q.pop(0)
        if x.left:
            q.append(x.left)
        if x.right:
            q.append(x.right)
        if x.right and not x.left:
            a.append(x.right.key)
        if x.left and not x.right:
            a.append(x.left.key)
    return a
		
if __name__=="__main__":
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.right = Node(4)
    root.right.left = Node(5)
    root.right.left.left = Node(6)

    print(h(root))


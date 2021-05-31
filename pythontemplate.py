#Choose any one 
###############First template################
import math, sys, collections, functools, time, itertools

sys.setrecursionlimit(10**6)

def Read_Ints()     : return map(int, input().strip().split())
def Read_Array()    : return list(Read_Ints())
def Read_Strings()  : return list(input().strip().split())
def printxsp(*args) : return print(*args, end="")
def printsp(*args)  : return print(*args, end=" ")

d4i = [-1, +0, +1, +0]; d8i = [-1, -1, +0, +1, +1, +1, +0, -1] 
d4j = [+0, +1, +0, -1]; d8j = [+0, +1, +1, +1, +0, -1, -1, -1]


#############second template############
import sys
import math
import bisect
from sys import stdin,stdout
from math import gcd,floor,sqrt,log
from collections import defaultdict as dd
from bisect import bisect_left as bl,bisect_right as br

sys.setrecursionlimit(100000000)

intinp    =lambda: int(input())
strinp  =lambda: input().strip()
joinn     =lambda x,l: x.join(map(str,l))
strl   =lambda: list(input().strip())
mapp    =lambda: map(int,input().strip().split())
mulf   =lambda: map(float,input().strip().split())
lis    =lambda: list(map(int,input().strip().split()))

ceil   =lambda x: int(x) if(x==int(x)) else int(x)+1
ceildiv=lambda x,d: x//d if(x%d==0) else x//d+1

flush  =lambda: stdout.flush()
stdstr =lambda: stdin.readline()
stdint =lambda: int(stdin.readline())
stdprint  =lambda x: stdout.write(str(x))

mod=1000000007

print(stdint())
##############################
# if __name__=='__main__':
#code
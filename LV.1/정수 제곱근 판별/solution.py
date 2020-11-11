import math

def solution(n):
    x = math.sqrt(float(n))
    if x ==int(x):
        return (x+1)*(x+1)
    else:
        return -1

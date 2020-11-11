def solution(x):
    c = 0
    for i in str(x):
        c += int(i)
    if x % c ==0:
        return True
    else:
        return False

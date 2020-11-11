def solution(n):
    n=sorted(str(n),reverse=True)
    new=''
    for i in n:
        new = new +i
    return int(new)

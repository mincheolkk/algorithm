def solution(a):
    b=[]
    c=0
    a.sort()

    for i in range(len(a)):
        for j in range(i+1,len(a)):
            c=a[i]+a[j]
            b.append(c)
    b = set(b)
    b = list(b)
    b.sort()
    return b

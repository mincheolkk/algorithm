def solution(n, m):
    answer = []
    r = m%n
    k = n*m
    while (n>0):
        m = (m//n)*n + r
        if r == 0:
            min = n
            break
        m = n
        n = r
        r = m%n
    max = k /min
    answer =[min,max]

    return answer

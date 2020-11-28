#solution 1
def solution(m):
    n =3
    r = m%n
    na = []
    q=[]
    if (m<=2):
        return m
    while (n>0):
        m = (m//n)*n + r
        if m<3:
            break
        q.append(m//n)
        na.append(r)
        m = (m//n)
        r = m%n

    three=str(q[-1])

    for i in na[::-1]:
        three +=str(i)

    answer = 0
    for i in range(len(three)):
        answer += 3**(i)*int(three[i])
    return answer


#solution 2
def solution(m):
    n =3 
    r = m%n
    na = []
    
    if (m<=2):
        return m
    while (n>0):
        m = (m//n)*n + r
        if m<3:
            break
        na.append(r)
        m = (m//n)
        r = m%n
        
    na.append(r)
    na.reverse()

    answer = 0
    for i in range(len(na)):
        answer += 3**(i)*int(na[i])
    return answer

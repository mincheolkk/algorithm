def solution(s):
    u = []
    l = []
    for i in s:
        if i.isupper():
            u.append(i)
            u.sort(reverse = True)
        else:
            l.append(i)
            l.sort(reverse = True)
    answer = l + u
    answer = ''.join(answer)
    return answer

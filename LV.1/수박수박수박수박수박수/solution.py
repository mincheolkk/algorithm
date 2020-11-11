def solution(n):
    answer=[]
    for i in range(1,n+1):
        if i%2==1:
            answer.append("수")
        else:
            answer.append("박")
    ans=''.join(answer)
    return ans

def solution(n):
    answer = []

    for i in str(n):
        num = int(i)
        answer.append(num)

    answer.reverse()
    return answer

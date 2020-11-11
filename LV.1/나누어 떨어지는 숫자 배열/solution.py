def solution(arr, divisor):
    answer = []
    f = []
    for i in arr:
        if i % divisor == 0:
            answer.append(i)
        else:
            f.append(i)
    if len(f) == len(arr):
        return -1
    else:
        answer.sort()
        return answer

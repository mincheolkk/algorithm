def solution(arr):
    a=len(arr)
    b=0
    for i in arr:
        b+=i

    answer = b/a
    return answer

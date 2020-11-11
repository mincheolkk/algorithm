def solution(n):
    answer = 0
    final_minus_one = 0
    final_minus_two = 0

    for i in range(n+1):
        if i == 2 :
            final_minus_one = i-1
            final_minus_two = i-2
        answer = final_minus_one + final_minus_two
        final_minus_two = final_minus_one #이게 바로 생각나지 않았다
        final_minus_one = answer
    answer = answer %1234567
    return answer

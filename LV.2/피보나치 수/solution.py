#첫 풀이는 재귀, 이 문제의 시간조건에선 시간초과로 답으로 인정되지는 않았다.
def solution(n):
    def fibo(n):
        if n ==0:
            return 0
        elif n == 1 :
            return 1
        else:
            return fibo(n-1)+fibo(n-2)

    answer = fibo(n)%1234567
    return answer


#두 번째 풀이는 for문 

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

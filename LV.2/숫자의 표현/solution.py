def solution(n):
    sum = 0
    count = 0
    for k in range(1,n+1):
        sum = sum + k
        if (n-sum-k)%k == 0:
            count = count + 1
            if sum > n:
                break
    count = count -1
    return count

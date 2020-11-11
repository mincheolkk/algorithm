def solution(n):
    count = 0
    for i in range(1,501):
        if n % 2 == 0:
            n = n / 2
            count = count + 1
        elif n == 1 :
            break
        elif n % 2 != 0:
            n = n * 3 + 1
            count = count + 1
    if n != 1.0:
        return -1
    else:
        return count

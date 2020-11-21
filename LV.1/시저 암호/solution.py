def solution(s, n):
    capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    small = "abcdefghijklmnopqrstuvwxyz"

    answer =""
    for i in s:
        if i.islower():
            index = small.index(i)+n
            answer += small[index % 26]
        elif i.isupper():
            index = capital.index(i)+n
            answer += capital[index % 26]
        else:
            answer += i

    return answer

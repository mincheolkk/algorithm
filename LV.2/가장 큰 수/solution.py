#solution 1.
def solution(numbers):
    b = []
    d=[]

    for i in numbers:
        i = str(i)
        j = i*3
        c = [i[0],j,i]
        b.append(c)
    b=sorted(b, reverse=True)
    for i in range(len(b)):
        d.append(b[i][2])
    answer = "".join(d)
    if answer[0] == "0":
        return "0"
    return answer


#solution 2. lambda 사용한 풀이
def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: x*3, reverse=True)
    return str(int(''.join(numbers)))

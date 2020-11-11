def solution(s):
    b = s.split(" ")
    new =[]
    for i in b:
        i = int(i)
        new.append(i)

    min_value = min(new)
    min_value = str(min_value)
    max_value = max(new)
    max_value = str(max_value)


    answer = min_value+" "+max_value
    return answer

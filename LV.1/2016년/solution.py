def solution(a, b):
    m=[0,31,29,31,30,31,30,31,31,30,31,30,31]
    c=['FRI','SAT','SUN','MON','TUE','WED','THU']
    first = 0
    answer = 1
    for i in range(a):
        first += m[i]

    first = first + b
		answer = c[first%7-1]
    return answer

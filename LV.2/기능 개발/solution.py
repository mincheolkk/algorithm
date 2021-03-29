import math
def solution(progresses, speeds):
    days = []
    answer = []

    def one(a,b):
        x = 0
        x = math.ceil(a/b)
        return x

    for i in range(len(progresses)):
        days.append(one(100 - progresses[i],speeds[i]))

    count = 1
    for i in range(1, len(days)):
        if days[i-count]>=days[i]:
            count += 1
        else:
            answer.append(count)
            count = 1
    answer.append(count)

    return answer

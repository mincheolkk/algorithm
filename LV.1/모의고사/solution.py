def solution(answers):
    one = [1,2,3,4,5]
    two=[2, 1, 2, 3, 2, 4, 2, 5]
    three=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    score = [0,0,0]
    list = []

    for i,j in enumerate(answers):
        if j == one[i%len(one)]:
            score[0] += 1
        if j == two[i%len(two)]:
            score[1] += 1
        if j == three[i%len(three)]:
            score[2] += 1

    for p,r in enumerate(score):
        if r == max(score):
            list.append(p+1)

    return list

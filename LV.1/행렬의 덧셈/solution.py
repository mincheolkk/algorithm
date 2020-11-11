def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        answer.append(arr1[i])
        for j in range(len(arr1[i])):
            answer[i][j] = arr1[i][j]+arr2[i][j]
    return answer

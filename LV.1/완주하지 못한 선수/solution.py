import collections

def solution(participant, completion):
    p = collections.Counter(participant)
    c = collections.Counter(completion) 

    return list(p-c)[0]


#첫풀이, 정확성은 다 맞았으나 효율성은 실패. 
#for 문에 pop 연산까지 O(N^2) 
def solution(participant, completion):
    for i in completion:
        if i in participant:    
            b = participant.index(i)
            participant.pop(b)  
                  
    answer = participant[0]
    return answer

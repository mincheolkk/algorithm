def solution(s):
    a = len(s)
    if 1 <= a <=100:
        if a%2 ==0:
            c = s[a//2-1]
            d = s[a//2]
            e = c + d
            return str(e)
        else:
            b = s[a//2]
            return str(b)
    else:
        print("글자수제한 :  1글자 이상 100글자 이하")
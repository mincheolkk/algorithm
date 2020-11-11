def solution(strings, n):
    b = []
    t = []
    for i in range(len(strings)):
	    list = [strings[i][n], strings[i]]
	    b.append(list)
    b=sorted(b)
    for j in range(len(b)):
	    t.append(b[j][1])
    return t

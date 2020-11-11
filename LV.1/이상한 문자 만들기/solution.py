def solution(s):
    a= s.split(' ')
    new=''

    for i in a:
        b=len(i)
        for j in range(0,b):
            if j%2 ==0:
                u=i[j].upper()
                new = new + u
            else:
                l = i[j].lower()
                new = new + l
        new = new +" "
    return new[0:len(new)-1]

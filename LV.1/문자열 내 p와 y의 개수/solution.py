def solution(s):

    count_p = 0         
    count_y = 0         

    for i in s:         
        if "p" in i:    
            count_p += 1
        elif "P" in i:   
            count_p += 1
        elif "y" in i:  
            count_y += 1
        elif "Y" in i:  
            count_y += 1

    if count_y == count_p:
        return True     
    else:
        return False

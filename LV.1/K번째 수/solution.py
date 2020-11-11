def solution(array, commands):
		last_arr = []

		for i in commands:                              
		    new_arr = array[i[0]-1:i[1]]       
		    new_arr.sort()                     
                                   
		    last_arr.append(new_arr[i[2]-1])   

		return last_arr

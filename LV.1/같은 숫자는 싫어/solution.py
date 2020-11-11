def solution(arr):
	new_arr =[]

	number = -1

	for i in arr:
	    if number != i :
	       number = i
         new_arr.append(number)
	return new_arr

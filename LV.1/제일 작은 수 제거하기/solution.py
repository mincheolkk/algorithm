def solution(arr):
    number=arr[0]
    if len(arr)>=2 :
        for i in range(len(arr)):
            if arr[i]<=number:
                number = arr[i]
                b = arr.index(arr[i])
        arr.remove(arr[b])
    else:
        arr = [-1]
    return arr

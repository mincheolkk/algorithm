def solution(s):
    a = len(s)
    if s.isdigit():
        if a == 4 or a == 6:
            return True
        else:
            return False
    else:
        return False

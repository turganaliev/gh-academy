def match_ends(words):
    count = 0

    for s in words:
        if len(s) >= 2 and s[0] == s[-1]:
            count += 1
    
    return count


print(match_ends(['aba', 'xyz', 'aa', 'x', 'bbb']))
print(match_ends(['', 'x', 'xy', 'xyx', 'xx']))
print(match_ends(['aaa', 'be', 'abc', 'hello']))
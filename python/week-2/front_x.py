def front_x(words):
    res = []
    count = 0

    for s in words:
        if s[0] == "x":
            res.append(s)
            count += 1
        
    words.sort()
    res.extend(words[:-count])
    return res

print(front_x(['bbb', 'ccc', 'axx', 'xzz', 'xaa']))
print(front_x(['ccc', 'bbb', 'aaa', 'xcc', 'xaa']))
print(front_x(['mix', 'xyz', 'apple', 'xanadu', 'aardvark']))

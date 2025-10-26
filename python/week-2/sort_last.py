def sort_last(tuples):
    main = []
    res = []

    for item in tuples:
        main.append(item[-1])
    
    main.sort()

    for num in main:
        for item in tuples:
            if item[-1] == num:
                res.append(item)

    return res

print(sort_last([(1, 3), (3, 2), (2, 1)]))
print(sort_last([(2, 3), (1, 2), (3, 1)]))
print(sort_last([(1, 7), (1, 3), (3, 4, 5), (2, 2)]))
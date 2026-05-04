def linear_search(data_list, target):
    for index, value in enumerate(data_list):
        if value == target:
            return index
    return -1
        

list1 = [1, 3, 6, 2, 19, 30, 5]
list2 = [5, 4, 5, 2, 63, 76, 4]
list3 = ['apple', 'banana', 'cherry']

print(linear_search(list1, 5))
print(linear_search(list2, 1))        
print(linear_search(list1, 19))       
print(linear_search(list3, 'banana'))

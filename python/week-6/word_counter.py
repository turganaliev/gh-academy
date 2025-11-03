def word_counter(sentence):
    words_list = sentence.split(" ")

    res = {}

    for i in words_list:
        if i in res:
            res[i] += 1
        else:
            res[i] = 1
    
    return res

print(word_counter("I love coding coding and coding"))
import re

def word_counter(sentence):
    clean_sentence = re.sub(r'[^\w\s]', '', sentence)
    words_list = clean_sentence.split(" ")

    res = {}

    for i in words_list:
        if i in res:
            res[i] += 1
        else:
            res[i] = 1
    
    return res

if __name__ == '__main__':
    print("Please enter your sentence: ")
    input_sentence = input()
    print(word_counter(input_sentence))
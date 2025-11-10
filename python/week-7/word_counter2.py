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
    
    print(f'My word counter as dict: {res}')

    res_list = []
    for key, value in res.items():
        res_list.append(f'{key}: {value}')
    
    print(f'My word counter as a list: {res_list}')

    return f'My word counter as a tuple: {tuple(res_list)}'

if __name__ == '__main__':
    print("Please enter your sentence: ")
    input_sentence = input()
    print(word_counter(input_sentence))
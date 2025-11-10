import re


from pathlib import Path

p = Path(__file__).with_name('alice.txt')
with p.open('r') as f:
    alice = f.read()

p = Path(__file__).with_name('small.txt')
with p.open('r') as f:
    small = f.read()

def print_words(text):
    clean_text = re.sub(r'[^a-zA-Z\s]', ' ', text).lower()
    words_list = clean_text.split(" ")

    res = {}

    for i in words_list:
        if i in res and i != '':
            res[i] += 1
        elif i != '':
            res[i] = 1

    for key, value in sorted(res.items()):
        print(f'{key}: {value}')


# print_words(alice)
print_words(small)
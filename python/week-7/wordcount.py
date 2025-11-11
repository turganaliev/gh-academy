import re
from pathlib import Path
import sys


def read_file(filename):
    p = Path(__file__).with_name(filename)
    with p.open('r') as f:
        content = f.read()
        clean_content = content.replace('\n', ' ')
        return clean_content

def get_clean_text(text):
        clean_text = re.sub(r'[^a-zA-Z\s]', ' ', text).lower()
        words_list = clean_text.split(" ")
        return words_list

def print_words(text):
    res = {}
    txt = get_clean_text(text)

    for i in txt:
        if i in res and i != '':
            res[i] += 1
        elif i != '':
            res[i] = 1

    for key, value in sorted(res.items()):
        print(f'{key}: {value}')


def print_top(text):
    res = {}
    txt = get_clean_text(text)

    for i in txt:
        if i in res and i != '':
            res[i] += 1
        elif i != '':
            res[i] = 1

    sorted_res = sorted(res.items(), key=lambda item: item[1], reverse=True)

    res_length = len(sorted_res)
    if res_length < 20:
        for i in range(res_length):
           print(sorted_res[i])
    else:
        for i in range(20):
           print(sorted_res[i])


def main():
  if len(sys.argv) != 3:
    print('usage: ./wordcount.py {--count | --topcount} file')
    sys.exit(1)

  option = sys.argv[1]
  filename = sys.argv[2]
  if option == '--count':
    print_words(read_file(filename))
  elif option == '--topcount':
    print_top(read_file(filename))
  else:
    print('unknown option: ' + option)
    sys.exit(1)


if __name__ == '__main__':
  main()
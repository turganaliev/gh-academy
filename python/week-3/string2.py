def verbing(s):
    if len(s) >= 3:
        if s[-3:] == "ing":
            return s + "ly"
        return s + "ing"
    return s

def test(got, expected):
  if got == expected:
    prefix = ' OK '
  else:
    prefix = '  X '
  print('%s got: %s expected: %s' % (prefix, repr(got), repr(expected)))

def main():
    print('verbing')
    test(verbing('hail'), 'hailing')
    test(verbing('swiming'), 'swimingly')
    test(verbing('do'), 'do')

if __name__ == '__main__':
    main()
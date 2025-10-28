def donuts(count):
    word = "many"

    if count >= 10:
        return "Number of donuts: %s" % (word)
    return "Number of donuts: %d" % (count)


def both_ends(s):
   if len(s) <= 2:
      return ""
   
   return s[:2] + s[-2:]


def fix_start(s):
    if len(s) >= 1:
       first = s[0]
       return first + s[1:].replace(first, "*")
    

def mix_up(a, b):
    new_a, new_b = list(a), list(b)
    char1, char2 = new_a[0], new_a[1]
    new_a[0], new_a[1] = new_b[0], new_b[1]
    new_b[0], new_b[1] = char1, char2
    return "".join(new_a) + " " + "".join(new_b)


def test(got, expected):
  if got == expected:
    prefix = ' OK '
  else:
    prefix = '  X '
  print('%s got: %s expected: %s' % (prefix, repr(got), repr(expected)))


def main():
  print('donuts')
  test(donuts(4), 'Number of donuts: 4')
  test(donuts(9), 'Number of donuts: 9')
  test(donuts(10), 'Number of donuts: many')
  test(donuts(99), 'Number of donuts: many')

  print()
  print('both_ends')
  test(both_ends('spring'), 'spng')
  test(both_ends('Hello'), 'Helo')
  test(both_ends('a'), '')
  test(both_ends('xyz'), 'xyyz')

  print()
  print('fix_start')
  test(fix_start('babble'), 'ba**le')
  test(fix_start('aardvark'), 'a*rdv*rk')
  test(fix_start('google'), 'goo*le')
  test(fix_start('donut'), 'donut')

  print()
  print('mix_up')
  test(mix_up('mix', 'pod'), 'pox mid')
  test(mix_up('dog', 'dinner'), 'dig donner')
  test(mix_up('gnash', 'sport'), 'spash gnort')
  test(mix_up('pezzy', 'firm'), 'fizzy perm')


if __name__ == '__main__':
  main()
import random

def simulation():
    six_sides = [1, 2, 3, 4, 5, 6]
    dice1 = random.choice(six_sides)
    dice2 = random.choice(six_sides)
    return dice1 + dice2

def func():
    freqs = {}
    times = int(input('How many times to roll the dice: '))

    for i in range(times):
        res = simulation()
        freqs[res] = freqs.get(res, 0) + 1
    
    return freqs

print(func())
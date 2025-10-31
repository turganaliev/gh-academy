from random import randrange


num = randrange(100)

for i in range(10):
    print("Please guess your number from 1 to 100: ")
    guess = int(input())

    if guess == num:
        print("Correct!")
        break
    elif guess > num:
        print("too high")
    else:
        print("too low")

print("Sorry, you run out of guesses!")

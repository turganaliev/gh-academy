from random import randrange

def guessing_game():
    num = randrange(100)

    for i in range(10):
        print("Please guess your number from 1 to 100: ")
        try:
            guess = int(input())
        except ValueError:
            print("Please enter a number!")
            continue

        if guess == num:
            print("Correct!")
            break
        elif guess > num:
            print("too high")
        else:
            print("too low")

    else:
        print("Sorry, you run out of guesses!")

if __name__ == '__main__':
    guessing_game()
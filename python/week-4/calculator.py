print("What is an amount of a bill?: ")
bill = int(input())

print("What is your name?: ")
name = input()

print("Please type the amount of a tip in percentage: ")
tip = int(input())

print("Please type how many people: ")
number_of_people = int(input())

tip_amount = (tip / 100) * bill
print("Your tip amount is: " + str(int(tip_amount)))

if tip > 20:
    print("Thank you for your generosity, " + name + "!")

total_bill = bill + tip_amount
print("Your total bill amount is: " + str(int(total_bill)))

each_person = total_bill / number_of_people
print("An amount of money for every person: " + str(int(each_person)))


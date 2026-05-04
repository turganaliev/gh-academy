class BankAccount:
    def __init__(self, name, balance=0):
        self.name = name
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f'Deposited: ${amount}. New balance: ${self.balance}')
        else:
            print('Deposit amount must be positive.')

    def withdraw(self, amount):
        if amount > self.balance:
            print('Insufficient funds.')
        elif amount <= 0:
            print('Withrawal amount must be positive')
        else:
            self.balance -= amount
            print(f'Withdrawn: ${amount}. New balance: ${self.balance}')
    
    def display_balance(self):
        print(f'Account owner: {self.name}')
        print(f'Current balance: ${self.balance}')


clientX = BankAccount('Eshmat Tashmatov', 1000)

clientX.deposit(1000000)
clientX.withdraw(100000)
clientX.display_balance()
        
    
tasks = []

while True:
    print("-----------------\n"
          "1) Add a new task\n"
          "2) View all tasks\n"
          "3) Delete a task\n"
          "4) Quit\n"
          "Please type a number of an action you want to do: ")

    try:
        action = int(input())

        if action == 1:
            print("Please type your task: ")
            task = input()
            tasks.append(task)
        elif action == 2:
            for task in tasks:
                print(task)
        elif action == 3:
            print("Please type a number of a task you want to delete: ")
            for task in range(len(tasks)):
                print(str(task + 1) + ") " + tasks[task])
            task_number = int(input())
            tasks.remove(tasks[task_number - 1])
        elif action == 4:
            break
        else: print("Enter number from 1 to 4")
    
    except ValueError:
        print("Please enter a number!")


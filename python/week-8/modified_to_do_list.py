from pathlib import Path


tasks = []

print("Your current tasks are: ")
try:
    p = Path(__file__).with_name('tasks.txt')
    with p.open('r') as f:
        contents = f.readlines()
    for task in contents[1:]:
        tasks.append(task)
except FileNotFoundError:
    with p.open('w') as f:
        f.write('')

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
            with p.open('+a') as f:
                f.write('\n' + task)
        elif action == 2:
            for task in tasks:
                print(task)
        elif action == 3:
            print("Please type a number of a task you want to delete: ")
            deleted = True
            while deleted:
                try:
                    for task in range(len(tasks)):
                        print(str(task + 1) + ") " + tasks[task])
                    task_number = int(input())
                    with p.open('r') as f:
                        content = f.read()
                        to_delete = content.replace(tasks[task_number - 1], '')
                    with p.open('w') as f:
                        f.write(to_delete)
                    tasks.remove(tasks[task_number - 1])
                    deleted = False
                except IndexError:
                    print(f"Choose in range of 1 to {len(tasks)}")
        elif action == 4:
            break
        else: print("Enter number from 1 to 4")
    
    except ValueError:
        print("Please enter a number!")

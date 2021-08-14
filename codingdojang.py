with open('words.txt', 'r') as file:
    a = None
    while a != '':
        a = file.readline().strip('\n')
        if list(a) == list(reversed(a)):
            print(a)


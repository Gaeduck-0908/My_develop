with open('words.txt','r') as file:
    a = file.readline().split()
    for b in a:
        if 'c' in b:
            print(b.strip(',.'))

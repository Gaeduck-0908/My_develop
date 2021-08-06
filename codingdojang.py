col, row = map(int, input().split())

matrix = []
    
for i in range(row):
    matrix.append(list(input()))
    
for i in range(col):
    for j in range(row):
        if matrix[i][j]=='*':
            print('*')
size,net_size = map(int, (input().split(' ')))
arr = [list(map(int, input().split())) for _ in range(size)]
temp = 0
max = 0

for i in range(size-1):
    for j in range(size-1):
        temp = 0
        temp += arr[i][j]
        for k in range(i+1, net_size-1):
            temp += arr[k][j]
            temp += arr[j][k]
            
            print(arr[k][j],end=' ')
            print(arr[j][k])
        if temp > max:
            max = temp
    
print(max)
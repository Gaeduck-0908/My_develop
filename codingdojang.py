b, a = map(int, input().split())
c = [2 ** i for i in range(b, a + 1)]
del c[1]
del c[-2]
print(c)
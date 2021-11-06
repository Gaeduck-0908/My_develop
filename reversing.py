a = ["?",";","F","J","D","n","v","8","d","w","8","l","R","u","l","y","R","m","m","t"]
b = [20]

for i in range (0,len(a)):
    b[i] = ord(a[i]-1)

for i in range (0,len(a)):
    
    b[i] ^= 0x11
    b[i] ^= 0x1B
    b[i] -= 3

print(b)
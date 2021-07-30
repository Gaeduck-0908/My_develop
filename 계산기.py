# 계산기

def 더하기(x, y):
    return x + y

def 빼기(x, y):
    return x - y

def 곱하기(x, y):
    return x * y

def 나누기(x, y):
    return x / y


print("수식을 고르세요.")
print("1.더하기")
print("2.빼기")
print("3.곱하기")
print("4.나누기")

while True:

    choice = input("수식(1/2/3/4): ")

    
    if choice in ('1', '2', '3', '4'):
        num1 = float(input("첫번째 숫자를 입력하세요: "))
        num2 = float(input("두번째 숫자를 입력하세요: "))

        if choice == '1':
            print(num1, "+", num2, "=", 더하기(num1, num2))

        elif choice == '2':
            print(num1, "-", num2, "=", 빼기(num1, num2))

        elif choice == '3':
            print(num1, "*", num2, "=", 곱하기(num1, num2))

        elif choice == '4':
            print(num1, "/", num2, "=", 나누기(num1, num2))
        break
    else:
        print("다시 입력해주세요")
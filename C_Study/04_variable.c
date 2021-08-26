#include <stdio.h>

int main()
{
    int num = 0; //정수를 담아주는 변수

    int num1,num2,num3; //변수를 동시에 선언도 가능.
    num1 = 1;
    num2 = 2;
    num3 = 3;

    int num4=4 , num5=5; //다음과 같이 값도 넣어줄 수 있음.

    printf("%d\n" , num); //%d는 decimal (10진수) 를 의미함.
    printf("%d %d %d\n",num1,num2,num3);
    printf("%d %d\n",num4,num5);
    return 0;
}
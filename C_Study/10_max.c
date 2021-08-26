#include <stdio.h>
#include <limits.h>    // 자료형의 최댓값과 최솟값이 정의된 헤더 파일

int main()
{
    char num1 = CHAR_MAX;   // char의 최댓값보다 큰 수를 할당.
    short num2 = SHRT_MAX;  // short의 최댓값보다 큰 수를 할당.
    int num3 = INT_MAX; // int의 최댓값보다 큰 수를 할당. 
    long long num4 = LLONG_MAX; // long long의 최댓값보다 큰 수를 할당.

    // char, short, int는 %d로 출력하고 long long은 %lld로 출력
    printf("%d %d %d %lld\n", num1, num2, num3, num4);
    // -128 -32768 -2147483648 -9223372036854775808

    unsigned char num5 = UCHAR_MAX; // unsigned char의 최댓값

  
    unsigned short num6 = USHRT_MAX;    // unsigned short의 최댓값


    unsigned int num7 = UINT_MAX;   // unsigned int의 최댓값


    unsigned long long num8 = ULLONG_MAX;   // unsigned long long의 최댓값


    // unsigned char, unsigned short, unsigned int는 %u로 출력하고 
    // unsigned long long은 %llu로 출력
    printf("%u %u %u %llu\n", num5, num6, num7, num8); // 0 0 0 0
    return 0;
}
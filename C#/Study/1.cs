String[] arr;
int a, b;
int tmp_a = 0, tmp_b = 0;
int first = 1, second = 1;

arr = Console.ReadLine().Split();
a = int.Parse(arr[0]);
b = int.Parse(arr[1]);

if (a < 2 || b < 2 || a > 100000 || b > 100000 || a > b)
{
    Console.WriteLine("입력 오류");
}
else
{
    tmp_a = a;
    tmp_b = b;
}

while (tmp_a != 1)
{
    if (tmp_a % 2 == 0)
    {
        tmp_a /= 2;
    }
    else
    {
        tmp_a = tmp_a * 3 + 1;
    }
    first++;
}

while (tmp_b != 1)
{
    if (tmp_b % 2 == 0)
    {
        tmp_b /= 2;
    }
    else
    {
        tmp_b = tmp_b * 3 + 1;
    }
    second++;
}

if (first < second)
{
    Console.WriteLine(b + " " + second);
}

else
{
    Console.WriteLine(a + " " + first);
}
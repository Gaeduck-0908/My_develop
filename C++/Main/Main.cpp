#include <iostream>
#include <string>

using namespace std;

int main()
{

    int count, Player_1_pos = 0, Player_2_pos = 0;
    cin >> count;

    if (count > 100 || count < 1)
    {
        cout << "E";
        exit(0);
    }
    int* Player_1 = new int[count];
    int* Player_2 = new int[count];

    for (int i = 0; i < count; i++)
    {
        cin >> Player_1[i];
        if (Player_1[i] > 3 || Player_1[i] < 1)
        {
            cout << "E";
            exit(0);
        }
    }

    for (int i = 0; i < count; i++)
    {
        cin >> Player_2[i];
        if (Player_2[i] > 3 || Player_2[i] < 1)
        {
            cout << "E";
            exit(0);
        }
    }

    for (int i = 0; i < count; i++)
    {
        if (Player_1[i] == Player_2[i])
        {
            Player_1_pos = Player_1_pos;
            Player_2_pos = Player_2_pos;
        }
        else if (Player_2[i] != (Player_1[i] % 3) + 1)
        {
            Player_1_pos += 3;
            if (Player_2_pos == 0) { Player_2_pos = Player_2_pos; }
            else { Player_2_pos -= 1; }
        }
        else
        {
            if (Player_1_pos == 0) { Player_1_pos = Player_1_pos; }
            else { Player_1_pos -= 1; }
            Player_2_pos += 3;
        }
    }

    cout << Player_1_pos << " " << Player_2_pos;
}
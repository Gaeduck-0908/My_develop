package tutorial.ch01.ex_area;

import java.util.Scanner;

public class Main
{
    final public static double PI = 3.14159265358979323846264338327;
    final public static Scanner sc = new Scanner(System.in);
    public static int cli = -1;

    public static void main(String [] args)
    {
        do
        {
            menu();
        }while(cli != 0) ;
    }

    public static void menu()
    {
        System.out.print("너비 계산할 도형 선택 \n" +
                "1.사각형 \t 2.삼각형 \t 3.원 \t 0.종료 \n" +
                ">");

        cli = sc.nextInt();
        switch (cli)
        {
            case 1:
                area_square();
                break;
            case 2:
                area_triangle();
                break;
            case 3:
                area_circle();
                break;
            default:
                System.out.println("잘못 입력했어요...");
                break;
        }
    }

    private static void area_circle()
    {
        System.out.print("반지름 크기(cm)을 입력해주세요 : ");
        int h = sc.nextInt();

        System.out.printf("[결과] 원(반지름 : %d) 너비는 %f cm2 입니다.\n",h,h*h*PI);
    }

    private static void area_triangle()
    {

    }

    private static void area_square()
    {
        System.out.print("세로 크기(CM)을 입력해주세요 : ");
        int w = sc.nextInt();
        System.out.print("가로 크기(CM)을 입력해주세요 : ");
        int h = sc.nextInt();
        System.out.printf("[결과] 사각형(%dcm x %dcm) 너비는 %d cm2 입니다\n",w,h,w*h);
    }
}

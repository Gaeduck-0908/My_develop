package tutorial.count;

public class Main
{
    public static void main(String [] args)
    {
        System.out.println("변수1: "+args[0] + ", 변수2 :"+args[1]);
        int count = 0;
        int max = Integer.parseInt(args[0]);
        int bae = Integer.parseInt(args[1]);

        for(int i=1; i<=max; i++)if(i % bae == 0)count++;

        System.out.printf("1부터 %d까지 %의 배수는 %d개 입니다]n");
    }
}

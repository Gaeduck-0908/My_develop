import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main<a>
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long bomal = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long aa = Integer.parseInt(st.nextToken());
        long bb = Integer.parseInt(st.nextToken());
        long cc = Integer.parseInt(st.nextToken());

        long a = 0;
        long b = 0;
        long c = 0;

        while (bomal >= 12)
        {
            bomal -= 12;
            a += aa;
        }
        while (a >= 8)
        {
            a -= 8;
            b += bb;
        }
        while(b >= 5)
        {
            b -=5;
            c += cc;
        }
        System.out.print(c);
        br.close();
    }
}

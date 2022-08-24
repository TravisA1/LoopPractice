import java.util.Scanner;

public class Loop {
    private Scanner keyboardreader;
    public Loop()
    {
        keyboardreader = new Scanner(System.in);
    }
    public void starPrinter()
    {
        System.out.print("Give a number. ");
        int num = keyboardreader.nextInt();
        for (int i=0;i<num;i++)
        {
            System.out.print("*");
        }
    }
    public void boxPrinter()
    {
        System.out.print("Give me another number. ");
        int num = keyboardreader.nextInt();
        for (int i=0;i<num;i++)
        {
            for (int j=0;j<num-1;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public void triangleBuilder()
    {
        int lim = 0;
        System.out.print("Give me the leg lengths. ");
        int num = keyboardreader.nextInt();
        for (int i=0;i<num;i++)
        {
            for (int j=0;j<lim;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
            lim++;
        }
    }
}

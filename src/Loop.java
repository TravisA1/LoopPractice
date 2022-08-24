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
    public void hollowBox()
    {
        int layer = 1;
        System.out.print("Give me the side length. ");
        int num = keyboardreader.nextInt();
        for (int i=0;i<num;i++)
        {
            if (layer == 1 | layer == num)
            {
                for (int j=1;j<num;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for (int j=0;j<num-2;j++)
                {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
            layer++;
        }
    }
    public void hollowTriangle()
    {
        int layer = 0;
        System.out.print("Give me the height. ");
        int num = keyboardreader.nextInt();
        for (int i=0;i<num;i++)
        {
            for (int j=0;j<(num-1)-layer;j++)
            {
                System.out.print(" ");
            }
            if (layer == num-1)
            {
                for (int j=0;j<2*num;j++)
                {
                    System.out.print("-");
                }
            }
            else
            {
                System.out.print("/");
                for (int j=0;j<2*layer;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("\\");
            }
            layer++;
        }
    }
    public void triangleNumber() {
        int lim = 0;
        int count = 0;
        System.out.print("Give me the leg lengths. ");
        int num = keyboardreader.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < lim; j++) {
                count++;
            }
            count++;
            lim++;
        }
        System.out.println("The triangle number for " + num + " is " + count);
        System.out.println("The expected number is " + (num * (num + 1)) / 2);
    }
    public void powerOfTwo()
    {
        int num = 1;
        while (num<66000)
        {
            System.out.println(num);
            num *= 2;
        }
    }
}

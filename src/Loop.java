import java.util.Scanner;

public class Loop {
    private Scanner keyboardreader;
    public Loop()
    {
        keyboardreader = new Scanner(System.in);
    }
    public void run()
    {
        System.out.print("Give a number. ");
        int num = keyboardreader.nextInt();
        for (int i=0;i<num;i++)
        {
            System.out.print("*");
        }
    }
}

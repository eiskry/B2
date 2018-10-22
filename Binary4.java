import java.util.Scanner;

public class IntegerToBinary
{
    public static void main(String[] args)
    {
	int num;
	String str = "";
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	while(num > 0)
	    {
		int y = num % 2;
		str = y + str;
		num = num / 2;
	    }
	System.out.println(str);
	sc.close();
    }
}
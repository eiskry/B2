import java.io.*;

    public class Fib {
	public static int fib(int n) {
	    if (n == 0) {
		return 0;
	    } else if (n == 1) {
		return 1;
	    } else {
		return fib(n-1)+fib(n-2);
	    }
	}
	public static void main(String[] args) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
		String line;
		line = reader.readLine();
		int a = Integer.parseInt(line);
		System.out.println(a+" "+fib(a)+" ");
	} catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("æåのååがæしくありません．");
        }
    }
}
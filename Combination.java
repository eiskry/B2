import java.io.*;
public class Combination {
    public static int comb(int m, int n) {
	if (m == n) {
            return 1;
        } else if (n==0){
            return 1;
	} else {
	    return comb(m-1,n-1)+comb(m-1,n);
		}
    }
    public static void main(String[] args) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
		String line1 = reader.readLine();
		String line2= reader.readLine();
		int a = Integer.parseInt(line1);
		int b = Integer.parseInt(line2);
		System.out.println("comb("+a+","+b+") = "+comb(a,b));
	    } catch (IOException e) {
		System.out.println(e);
	    } catch (NumberFormatException e) {
		System.out.println("æåのååがæしくありません．");
	    }
    }
}
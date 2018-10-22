import java.io.*;

public class Ack {
    public static int ack(int m,int n) {
	if (m == 0) {
            return n+1;
        } else if (n == 0 ){
	    return ack(m-1,1);
	} else {
	    return ack(m-1,ack(m,n-1));
	}
    }
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line1 = reader.readLine();
	    String line2= reader.readLine();
	    int a = Integer.parseInt(line1);
	    int b = Integer.parseInt(line2);
	    System.out.println("ack("+a+","+b+") = "+ack(a,b));
	} catch (IOException e) {
	    System.out.println(e);
	} catch (NumberFormatException e) {
	    System.out.println("æåのååがæしくありません．");
	}
    }
}
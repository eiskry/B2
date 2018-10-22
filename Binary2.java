import java.io.*;

public class Binary2 {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line = reader.readLine();
	    int a = Integer.parseInt(line);
	    System.out.println( Integer.toBinaryString(a));
	} catch (IOException e) {
	    System.out.println(e);
	} catch (NumberFormatException e) {
	    System.out.println("æåのååがæしくありません．");
	}
    }
}    
	    
	
    

	
       
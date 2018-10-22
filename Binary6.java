import java.io.*;

public class Binary6 {
    public static void main( String[] args ) {
	int    num;
	String str;
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	try {
	    str = input.readLine();
	    num = Integer.parseInt( str );
	}
	catch ( IOException e ) {
	    System.out.println( e );
	    return;
	}
	catch ( NumberFormatException e ) {
	    System.out.println( "Error : æåをååしてください！" );
	    return;
	}
	String bin ;
	bin = "";
	do {
	    if ( 0 == ( num % 2 ) )
		bin = "0" + bin;
	    else
		bin = "1" + bin;
	        num = num / 2;
	} while( 0 < num );
	System.out.println( bin );
    }
}
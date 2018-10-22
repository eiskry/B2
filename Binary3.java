import java.util.*;

public class Binary3 {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int bin[]  = new int[16];
	int n = 0; 
	int x  = sc.nextInt();
	while (x >= 2) {
	    bin[n] = x % 2;
	    n++;
	    x = x / 2;
	}
	bin[n] = x;
	n++;
	for (int i = n - 1; i >= 0; i--) {
	    System.out.print(bin[i]);
	}
    }
}
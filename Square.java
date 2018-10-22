xpublic class Square {
    public static void main(String[] args) {
	int a,b,c,d,e,f,g,h,i,j,k,l;
        a = 1;
	b = sq(a);
        c = 3;
	d = sq(c);
        e = 5;
	f = sq(e);
        g = 7;
	h = sq(g);
        i = 9;
	j = sq(i);
        k = 11;
        l = sq(k);
	System.out.println(a+" "+b);
	System.out.println(c+" "+d);
	System.out.println(e+" "+f);
	System.out.println(g+" "+h);
	System.out.println(i+" "+j);
	System.out.println(k+" "+l);
    }
    public static int sq(int n) {
	return n*n;
    }
}
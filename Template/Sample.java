//package Codeforces;

import java.io.*;
import java.util.*;
public class Sample
{
	public static void main(String[] args)throws Exception{ new Sample().run();} 
	long mod=1000000000+7;
//	int[][] ar;
	
	int[] prime = new int[101];
	
	void sieve(){
		
		prime[0] = prime[1]=0;
		for(int i=2;i*i<=100;i++){
			
			for(int j=i*i;j<=100;j+=i){
				
				prime[j]=0;
			}
		}
	}
	void solve() throws Exception
	{
        String s="asasds ggsddf sada";
        // int x=Integer.parseInt(s);
        // int a=Integer.MAX_VALUE ;
		// out.print(x+1+" ");
        String[] c= s.split(" ");
        //char[] carr= s.toCharArray();
        String a=String.join("",c);
		out.print(a);
	}
	int BS(long[] prefix,int i,int j,long x){
		
		while(i<=j){
			
			int mid = (i+j)/2;
			
			if(prefix[mid]==(long)x){
				return mid;
			}
			
			if(prefix[mid]<x){
				i=mid+1;
			}else j=mid-1;
		}
		return i;
	}
	
	String  findStr(String s){
		String ans="";
		int n = s.length();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				String k = "";
				k+=s.charAt(i);
				k+=s.charAt(j);
				if(prime[Integer.parseInt(k)]==0){
					ans = k;
					break;
				}
			}
		}
		return ans;
	}
	
	int StringToInt(String s){
		
		int n = s.length();
		int res=0;
		for(int i=n-1;i>=0;i--){
			res +=(int)Math.pow(2, n-i-1);
			
		}
		return res;
	}
	
	
	 void ruffleSort(int[] a) {
		//ruffle
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n), temp=a[i];
			a[i]=a[oi];
			a[oi]=temp;
		}
		
		//then sort
		Arrays.sort(a);
	}

	
	/*FAST INPUT OUTPUT & METHODS BELOW*/
	
	private byte[] buf=new byte[1024];
	private int index;
	private InputStream in;
	private int total;
	private SpaceCharFilter filter;
	PrintWriter out;
	
	int min(int... ar){int min=Integer.MAX_VALUE;for(int i:ar)min=Math.min(min, i);return min;}
	long min(long... ar){long min=Long.MAX_VALUE;for(long i:ar)min=Math.min(min, i);return min;}
	int max(int... ar) {int max=Integer.MIN_VALUE;for(int i:ar)max=Math.max(max, i);return max;}
	long max(long... ar) {long max=Long.MIN_VALUE;for(long i:ar)max=Math.max(max, i);return max;}
	
	void shuffle(int a[]) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++) 
			al.add(a[i]);
		
		Collections.sort(al);
		for(int i=0;i<a.length;i++) 
			a[i]=al.get(i);
	}
	long lcm(long a,long b)
	{
		return (a*b)/(gcd(a,b));
	}
	
	int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b%a, a); 
	} 
	long gcd(long a, long b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b%a, a); 
	}
	/* for (1/a)%mod = ( a^(mod-2) )%mod  ----> use expo to calc -->(a^(mod-2)) */
	long expo(long p,long q)  /*  (p^q)%mod   */
	{
		long z = 1;
		while (q>0) {
			if (q%2 == 1) {
				z = (z * p)%mod;
			}
			p = (p*p)%mod;
			q >>= 1;
		}
		return z;
	}
	void run()throws Exception
	{
		in=System.in; out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	private int scan()throws IOException
	{
		if(total<0)
			throw new InputMismatchException();
		if(index>=total)
		{
			index=0;
			total=in.read(buf);
			if(total<=0)
				return -1;
		}
		return buf[index++];
	}
	private int ni() throws IOException 
	{
		int c = scan();
		while (isSpaceChar(c))
			c = scan();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = scan();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = scan();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	private long nl() throws IOException 
	{
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = scan()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = scan();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = scan();
		}
	}
	private double nd() throws IOException{
		return Double.parseDouble(ns());
	}
	private String ns() throws IOException {
		int c = scan();
		while (isSpaceChar(c))
			c = scan();
		StringBuilder res = new StringBuilder();
		do {
			if (Character.isValidCodePoint(c))
				res.appendCodePoint(c);
			c = scan();
		} while (!isSpaceChar(c));
		return res.toString();
	}
	private String nss() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	private char nc() throws IOException 
	{
		int c = scan();
		while (isSpaceChar(c))
			c = scan();
		return (char) c;
	}
	private boolean isWhiteSpace(int n)
	{
		if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
			return true;
		return false;
	}
	private boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return isWhiteSpace(c);
	}
	private interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt() , d = sc.nextInt();
		    System.out.println(Math.max(a , b) + Math.max(c , d));
		}

	}
}


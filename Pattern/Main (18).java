import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	 int nsp= n-1;
	 int nst = 1;
	 for(int i=1;i<=n;i++){
	     for(int j=1;j<=nsp;j++)
	         System.out.print(" ");
	     
	     for(int j=1;j<=nst/2;j++)
	         System.out.print(j);
	     
	     for(int j=nst/2-1;j>0;j--)
	         System.out.print(j);
	   
	     nsp--;
	     nst =nst+2;
	       System.out.println();
	 }
	 
	}
}

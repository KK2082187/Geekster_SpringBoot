import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	 int nsp= n-1;
	 int nst = 1;
	 for(int i=0;i<n;i++){
	     int num = i+1;
	     for(int j=0;j<nsp;j++)
	         System.out.print(" ");
	     
	     for(int j=0;j<nst;j++){
	         System.out.print(num);
	      if(j<nst/2)
	          num++;
	      else
	          num--;
	      
	     }
	   
	     nsp--;
	     nst =nst+2;
	       System.out.println();
	 }
	 
	}
}

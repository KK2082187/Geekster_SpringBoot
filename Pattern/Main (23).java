import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	 for(int i=n;i>=1;i--){
	     for(int j=n;j>=1;j--){
	         if(i+j==n+1)
	         System.out.print("* ");
	         else
	         System.out.print(j+ " ");
	     }
	     System.out.println();
	 }
	    
	 }
	  
	}


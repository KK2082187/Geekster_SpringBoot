import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	 for(int i=1;i<=n;i++){
	     for(int j=1;j<=2*i-1;j++){
	         if(j%2==1){
	             System.out.print(i);
	         }else{
	             System.out.print("*");
	         }
	     }
	     System.out.println();
	 }
	  for(int i=n-1;i>=1;i--){
	     for(int j=1;j<=2*i-1;j++){
	         if(j%2==1){
	             System.out.print(i);
	         }else{
	             System.out.print("*");
	         }
	     }
	     System.out.println();
	 }
	}
}

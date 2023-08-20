import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n= scn.nextInt();
    for(int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
            
            System.out.print(k+1);
           
        }
        System.out.println();
    }
   
	}
}


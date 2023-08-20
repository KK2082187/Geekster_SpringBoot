import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n= scn.nextInt();
     
    for(int i=n;i>=0;i--){
        for(int j=0;j<2*(n-i);j++){
            System.out.print(" ");
        }
        for(int k=0;k<i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
	}
}

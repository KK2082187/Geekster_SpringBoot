import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n= scn.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<2*i;k++){
            if(k%2==1)
            System.out.print("*");
            else
            System.out.print("!");
        }
        System.out.println();
    }
	}
}

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
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=n-1;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=n-i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
	}
}


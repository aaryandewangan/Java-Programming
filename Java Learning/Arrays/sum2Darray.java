package Arrays;
import java.util.*;

class Sum2DArray
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter total Number of rows and columns of the Matrix A and B: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int arr1[][] = new int[a][b];
        int arr2[][] = new int[a][b];

        System.out.println("Enter elements for MATRIX A: ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX A: ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Enter elements for MATRIX B: ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX B: ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }

        int sum[][] = new int[a][b];
        System.out.println("SUM OF A AND B: ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
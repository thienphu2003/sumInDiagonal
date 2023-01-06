import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng và cột");
        int x = sc.nextInt();
        int[][] matrix = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Hãy nhập phần tử ở dòng " + (i + 1) + "cột " + (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        int sum1=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các số trên đường chéo là : "+sum);
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(j==x-1-i)
                {
                    sum1=sum1+matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các số trên đường chéo phụ là :" +sum1);
    }
}

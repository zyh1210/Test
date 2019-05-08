import java.util.Scanner;

public class Test {
    public static int number(int n, int m){
        int count=0;
        int [][] A=new int[n][m];
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                if (A[1-i][j]==A[1+i][j]){
                    count++;
                }
                if (A[i][1-j]==A[i][1+j]){
                    count++;
                }
            }
        }
        return count/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            int n =sc.nextInt();
            int m=sc.nextInt();
            System.out.println(number(n,m));
        }
    }
}

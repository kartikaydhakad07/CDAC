// Array Manipulation
// Problem: Perform a series of operations to manipulate an
// array based on range update queries. Each query adds a value
// to a range of indices.



import java.util.Scanner;

public class Program8 {

    static int manipulateArray(int[] arr, int[][] que) {
        int s = 0;
        int e = 0;
        int val = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < que.length; i++) {
            
            s = que[i][0];   
            e = que[i][1];   
            val = que[i][2];
            System.out.println(s);
            System.out.println(e);

            for(int j=s-1; j<=e-1; j++){
                    arr[j] = arr[j] + val;
                    if(arr[j] > max){
                        max = arr[j];
                    }
            }
        }
    
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter no of query ");
        int r = sc.nextInt();
        System.out.println("Enter query ");
        int que[][] = new int[r][3];
        for (int i = 0; i < que.length; i++) {
            for (int j = 0; j < que[i].length; j++) {
                que[i][j] = sc.nextInt();
            }
        }

        System.out.println(manipulateArray(arr,que));
        sc.close();
    }
}

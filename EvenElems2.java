import java.util.Scanner;

public class EvenElems2 {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = cs.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
    }
}

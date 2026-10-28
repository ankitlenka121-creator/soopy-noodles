import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        int ch = sc.nextInt();
        if (ch == 1) {
            brute();
        }
        if (ch == 2) {
            // better();
        }
        if (ch == 3) {
            //optimal();
        }
    }

    static void brute() {
        Scanner op = new Scanner(System.in);
        int m, i, j;
        System.out.println("enter your no of element");
        m = op.nextInt();
        System.out.println("enter your  element");
        int[] arr = new int[m];
        for (i = 0; i < m; i++) {
            arr[i] = op.nextInt();
        }
        for (i = 0; i < m; i++) {
            int count = 0;

            for (j = 0; j < m; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > m / 2){
                System.out.println("majority element:" + arr[i]);
            return;}


        }
        System.out.println("-1");
    }
}



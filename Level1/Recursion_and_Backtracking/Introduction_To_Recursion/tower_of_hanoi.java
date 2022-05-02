package Level1.Recursion_and_Backtracking.Introduction_To_Recursion;

import java.util.Scanner;

public class tower_of_hanoi {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t1id = sc.nextInt();
    int t2id = sc.nextInt();
    int t3id = sc.nextInt();

    toh(n,t1id,t2id,t3id);

}

public static void toh(int n, int t1, int t2, int t3){

        if(n==0){
            return;
        }
        toh(n-1,t1,t3,t2);
        System.out.println(n + "[" + t1+ " -> " + t2+ "]" );
        toh(n-1,t3,t2,t1);


}

}
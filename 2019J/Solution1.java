import java.util.Scanner;
public class Solution1New{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int a3 = n.nextInt();
        int a2 = n.nextInt();
        int a1 = n.nextInt();
        int b3 = n.nextInt();
        int b2 = n.nextInt();
        int b1 = n.nextInt();
        if((3 * a3 + 2 * a2 + a1) > (3 * b3 + 2 * b2 + b1)){
            System.out.println("A");

        }
        else if((3 * a3 + 2 * a2 + a1) == (3 * b3 + 2 * b2 + b1)){
            System.out.println("T");

        }
        else{
            System.out.println("B");
        }
    }
}
import java.util.Scanner;
public class Solution3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextLine();
        }
        for(int i = 0; i < arr.length; i++){
            String a = arr[i];
            char scan = a.charAt(0);
            int count = 1;
            for(int j = 1; j < a.length(); j++){
                if((a.charAt(j) != scan)){
                    System.out.print(count + " ");
                    System.out.print(scan + " ");
                    scan = a.charAt(j);
                    count = 1;
                }
                else{
                    count ++;
                }
            }
            System.out.print(count + " ");
            System.out.print(scan);
            System.out.println();
        }
    }
}

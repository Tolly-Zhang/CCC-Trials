import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int length = n.nextInt();
        String[] arr = new String[2 *length];
        for(int i = 0; i < 2 * length; i++){
            arr[i] = n.next();
        }
        System.out.println("Array");
        for(int i = 0; i < arr.length; i++){
        
            System.out.println(arr[i]); 
        }
        System.out.println("Solution");
        String temp = "";
        for(int i = 0; i < length; i += 2){
            temp = arr[i + 1];
            for(int j = 0; j < (Integer.parseInt(arr[i]) - 1); j++){
                temp += arr[i + 1];
            }
            System.out.println(temp);
        }
}
}
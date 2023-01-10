import java.util.Scanner;
public class Solution4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[][] numbers = {{1, 2}, {3, 4}};
        int h_Flips = 0;
        int v_Flips = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'H'){
                h_Flips++;
                continue;
            }
            v_Flips++;
        }
        // System.out.println(h_Flips + " " + v_Flips);
        if(h_Flips % 2 != 0){
            numbers[0][0] = 3;
            numbers[0][1] = 4;
            numbers[1][0] = 1;
            numbers[1][1] = 2;
        }
        if(v_Flips % 2 != 0){
            int temp1 = numbers[0][1];
            int temp2 = numbers[1][1];
            numbers[0][1] = numbers[0][0];
            numbers[0][0] = temp1;
            numbers[1][1] = numbers[1][0];
            numbers[1][0] = temp2;
        }
        System.out.print(numbers[0][0] + " ");
        System.out.println(numbers[0][1]);
        System.out.print(numbers[1][0] + " ");
        System.out.println(numbers[1][1]);

    }
}

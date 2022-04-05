import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 25;
        arr[3] = 15;
        arr[4] = 35;


        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1-50: ");
        int x = s.nextInt();
            if(x<1 || x > 50){
                System.out.println("Enter valid number.");
            }
            else{
                System.out.println( Search(arr, x));
                
            }
            

        
    }
    
    public static int Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("BINGO!!");
            }
        }
        return 0;
    }
    
}

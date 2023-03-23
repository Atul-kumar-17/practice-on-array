import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i =0 ; i<10; i++){
            System.out.println("Enter a number");
            arr[i] = Sc.nextInt();
        }
        for (int i =0; i <10; i++){
            System.out.println(arr[i]);
        }
    }
}

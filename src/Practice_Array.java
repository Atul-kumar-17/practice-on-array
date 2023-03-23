import java.util.Arrays;

public class Practice_Array {
    public static void main(String[] args) {
        int[] arr = {1, 8,2,2, 9, 6, 7, 5 ,8,9,4,4,6,55};
//  print the elements of array
        for (int element : arr){
//            System.out.println(element);
        }
// second method
    for (int i =0; i< arr.length;i++){
        System.out.println(arr[i]+"");
    }
//largest element
    Arrays.sort(arr);
        System.out.println("Sorted array is :");
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);

        }
        System.out.println("largest element is :");
        System.out.println(arr[13]);
//second largest
        System.out.println("Second largest element is :");
        System.out.println(arr[12]);
//smallest element
        System.out.println("Smallest element is :");
        System.out.println(arr[0]);
//length of array
        System.out.println("Length of the array is :");
        System.out.println(arr.length);
// reverse order
        System.out.println("Reverse order ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+"");
        }
//duplicate elements
        for (int i =0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element");
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

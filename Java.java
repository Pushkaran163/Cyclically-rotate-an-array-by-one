import java.util.Arrays;

public class Java{
    static int[] arr = {1, 2, 3, 4, 5, 6, 7};
    public static void Rotate(){
        int last = arr[arr.length - 1];

        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }

    public static void main(String[] args){
        System.out.println("Given array");
        System.out.println(Arrays.toString(arr));
        Rotate();
        System.out.println("Rotated Array");
        System.out.println(Arrays.toString(arr));
    }
}
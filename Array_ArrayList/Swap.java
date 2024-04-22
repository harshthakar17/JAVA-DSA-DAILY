public class Swap {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5};
        swap(arr, 1, 3);

    }

     static void swap(int[] arr, int index1, int index2 ) {
        // TODO Auto-generated method stub
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    
}

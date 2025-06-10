public class OddEvenSort {
    public static void oddEvenSort(int[] arr) {
        boolean sorted = false;
        int n = arr.length;
        while (!sorted) {
            sorted = true;
        
            for (int i = 1; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            
            for (int i = 0; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 1, 7, 6};
        oddEvenSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
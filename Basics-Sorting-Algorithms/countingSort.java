/* 
 *The Complexcity of Counting Sort is Lesser than other Sorting Algo . 
 * it's  depends the Range . O(n+Range); Range <<< 7 .
 * So in this case 
 */

class countingSort {

    public static void Sorting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting <>
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }                               
    }

    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        Sorting(arr);
        printArray(arr);
    

    }
}

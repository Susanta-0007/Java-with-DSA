/* The Time Complexcity Of Bubble Sort is O(n^2) */
class bubbleSort{

    public static void Sorting(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    // Swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Sorting(arr);
        printArray(arr);


    }
}
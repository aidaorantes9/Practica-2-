
public class hilos {
    
    
    public void merge(int arr[],String arr2[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        String L2[] = new String[n1]; 
        int R[] = new int[n2];
        String R2[] = new String[n2];
        
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i){
            L[i] = arr[l + i];
            L2[i]= arr2[l + i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[m + 1 + j];
            R2[j] = arr2[m + 1+ j]; 
        }
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j] ) {
                arr[k] = L[i];
                arr2[k] = L2[i];
                i++;
            }
            else {
                arr[k] = R[j];
                arr2[k] = R2[i];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            arr2[k] = L2[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            arr2[k] = R2[i];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[],String arr2[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr,arr2, l, m);
            sort(arr,arr2, m + 1, r);
  
            // Merge the sorted halves
            merge(arr,arr2, l, m, r);
        }
    }
  
    /* A utility function to print array of size n */
    public void printArray(int arr[],String arr2[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "-" + arr2[i]);
        System.out.println();
    }
    
    
    
    
}

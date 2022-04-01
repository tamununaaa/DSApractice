import java.util.*;
class quickSort{
    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pivot = arr[high];                  //take last element as pivot
            int i = low-1;

            for(int j=low;j<=high-1;j++)
            {
                if(arr[j]<pivot)                    //check if current element is smaller than pivot
                {
                    i++;                            //increment index of smaller element 
                    swap(arr,i,j);
                }
            }
            swap(arr,i+1,high);
            int pi=i+1;                             //pi is the partitioning index

            sort(arr, low, pi-1);                   //sort elements before partition
            sort(arr, pi+1, high);                  //sort elements after partition
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                   //length of array
        int arr[] = new int[n];                 //declare array
        
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();                  //input array elements

        sort(arr,0,n-1);

        for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
    }
}

import java.util.*;
public class selectionSort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();                   //length of array
        int arr[] = new int[n];                 //declare the array

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();              //input the array elements
        
        for(int i=0;i<n-1;i++)
        {
            int mindex = i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mindex])          //find minimum element in unsorted sub-array
                    mindex = j;                 //assign minimum element index to mindex

                int temp = arr[i];              //swap minimum element with first element
                arr[i] = arr[mindex];
                arr[mindex] = temp;
            }
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    
}

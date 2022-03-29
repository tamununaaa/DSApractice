import java.util.*;
public class insertionSort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                   //length of array
        int arr[] = new int[n];                 //declare array

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();              //input the array elements

        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)           //move elements that are greater than key, to one position 
            {                                   //ahead of their current position
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");            
    }
}

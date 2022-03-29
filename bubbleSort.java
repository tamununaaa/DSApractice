import java.util.*;
public class bubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                   //length of array
        int arr[] = new int[n];                 //declare array
        
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();                  //input array elements
        
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1-i;j++)
                if(arr[j]>arr[j+1])             //check condition
                {
                    int temp = arr[j];          //swap elements
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        
        for(int i=0;i<n;i++)
                System.out.print(arr[i]+ " ");  //print sorted array

    }
}
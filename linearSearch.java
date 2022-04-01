import java.util.*;
public class linearSearch {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        boolean found = false;
        int n = sc.nextInt();           //array size
        int arr[] = new int[n];         //declare array
        
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();      //input array elements

        int x = sc.nextInt();           //element to be searched

        for(int i=0;i<n;i++)
            if(arr[i]==x)               //compare each element
                found = true;           //match found
        
        if(found==true)
            System.out.print("Element found!");
        else
            System.out.print("Element not found!");

    }
    
}

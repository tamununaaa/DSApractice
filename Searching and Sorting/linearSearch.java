import java.util.*;
public class linearSearch {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        boolean found = false;
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();           //element to be search

        for(int i=0;i<n;i++)
            if(arr[i]==x)
                found = true;
        
        if(found==true)
            System.out.print("Element found!");
        else
            System.out.print("Element not found!");

    }
    
}

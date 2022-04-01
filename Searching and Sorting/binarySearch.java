import java.util.*;
class binarySearch{
	static int search(int arr[], int l, int r, int x)     		//returns index if element found, else return -1 if not found
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)                                  //element is directly checked at middle
				return mid;

			if (arr[mid] > x)                                   //left subarray is checked if element is smaller than mid
				return search(arr, l, mid - 1, x);

			return search(arr, mid + 1, r, x);            		//since it is not in left subarray, element is 
		}														//checked in right subarray
		
		return -1;                                              //since element is not found, return -1
	}

	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();                                   //array size
	    int arr[] = new int[n];                                 //declare array
	    int x = sc.nextInt();                                   //element to be found
	    
	    for(int i=0;i<n;i++)
	        arr[i] = sc.nextInt();                              //input array elements
	    
		int result = search(arr, 0, n - 1, x);            		//call function and store in result variable
		
		if (result == -1)
			System.out.println("Element not present");          
		else
			System.out.println("Element found at position " + (result+1));
	}
}


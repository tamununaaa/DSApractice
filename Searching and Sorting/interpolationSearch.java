import java.util.*;
class Main{
    public static int search(int arr[], int lo, int hi, int x)
	{
		int pos;

		// Since array is sorted, an element
		// present in array must be in range
		// defined by corner
		if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

			// Probing the position with keeping
			// uniform distribution in mind.
			pos = lo
				+ (((hi - lo) / (arr[hi] - arr[lo]))
					* (x - arr[lo]));

			// Condition of target found
			if (arr[pos] == x)
				return pos;

			// If x is larger, x is in right sub array
			if (arr[pos] < x)
				return search(arr, pos + 1, hi,
										x);

			// If x is smaller, x is in left sub array
			if (arr[pos] > x)
				return search(arr, lo, pos - 1,
										x);
		}
		return -1;
	}

	// Driver Code
	public static void main(String[] args)
	{

		// Array of items on which search will
		// be conducted.
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    int x = sc.nextInt();
	    
	    for(int i=0;i<n;i++)
	        arr[i] = sc.nextInt();

		int index = search(arr, 0, n - 1, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at position " + (index+1));
		else
			System.out.println("Element not found.");
	}
}
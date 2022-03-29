import java.util.*;
class mergeSort
{
	static void merge(int arr[], int l, int m, int r)           //merges both sub-arrays
	{
		
		int n1 = m - l + 1;                                     //size of sub-array 1
		int n2 = r - m;                                         //size of sub-array 2

		int L[] = new int[n1];                                  //create 2 temporary arrays
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)                            //copy data from sub-arrays to respective temporary sub-arrays
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;                                       //initial indices of both sub-arrays

		int k = l;                                              //initial index of merged sub-array
		while (i < n1 && j < n2) {                              //merge both sub-arrays
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {                                        //copy remaining elements of L[] if any 
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {                                        //copy remaining elements of R[] if any
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[], int l, int r)
	{
		if (l < r) {    
			int m =l+ (r-l)/2;                                 //find the middle point

			sort(arr, l, m);                                   //sort first and second halves
			sort(arr, m + 1, r);

			merge(arr, l, m, r);                               //merge sorted halves
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                                   //length of array
        int arr[] = new int[n];                                 //declare array
        
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();                                  //take input in array
        
		sort(arr, 0, n - 1);                                    //sort the main array5

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		
	}
}

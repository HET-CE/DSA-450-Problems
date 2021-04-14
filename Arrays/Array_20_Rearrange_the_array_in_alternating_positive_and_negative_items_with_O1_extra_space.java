
public class Array_20_Rearrange_the_array_in_alternating_positive_and_negative_items_with_O1_extra_space {
	void rightrotate(int arr[], int n, int outofplace,int cur)
	{
		int tmp = arr[cur];
		for (int i = cur; i > outofplace; i--)
			arr[i] = arr[i - 1];
		arr[outofplace] = tmp;
	}

	void rearrange(int arr[], int n)
	{
		int outofplace = -1;

		for (int index = 0; index < n; index++) 
		{
			if (outofplace >= 0) 
			{
		     
	       if (((arr[index] >= 0)
	            && (arr[outofplace] < 0))
	           || ((arr[index] < 0)
	               && (arr[outofplace] >= 0))) {
	           rightrotate(arr, n, outofplace, index);
	
	           if (index - outofplace >= 2)
	               outofplace = outofplace + 2;
	           else
	               outofplace = -1;
       }
   }

		   if (outofplace == -1) 
		   {
		       if (((arr[index] >= 0)
		            && ((index & 0x01) == 0))
		           || ((arr[index] < 0)
		               && (index & 0x01) == 1))
		           outofplace = index;
		   }
		}
}

void printArray(int arr[], int n)
	{
	for (int i = 0; i < n; i++)
	   System.out.print(arr[i] + " ");
	System.out.println("");
	}

// Driver Code
	public static void main(String[] args)
		{
	Array_20_Rearrange_the_array_in_alternating_positive_and_negative_items_with_O1_extra_space rearrange 
	  = new Array_20_Rearrange_the_array_in_alternating_positive_and_negative_items_with_O1_extra_space();
/* int arr[n] = {-5, 3, 4, 5, -6, 
                -2, 8, 9, -1, -4};
int arr[] = {-5, -3, -4, -5, -6,
            2 , 8, 9, 1 , 4}; 
int arr[] = {5, 3, 4, 2, 1, 
            -2 , -8, -9, -1 , -4}; 
int arr[] = {-5, 3, -4, -7, 
            -1, -2 , -8, -9, 1 , -4};*/
	int arr[] = { -5, -2, 5, 2, 4,7, 1, 8, 0, -8 };
	int n = arr.length;

	System.out.println("Given array is ");
	rearrange.printArray(arr, n);

	rearrange.rearrange(arr, n);

	System.out.println("RearrangeD array is ");
	rearrange.printArray(arr, n);
	}
}

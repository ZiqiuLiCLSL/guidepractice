public class BubbleSort
{
	public static void main(String[] args) 
	{
		int arr[] = {24, 69, 80, 57, 13};
		int len = arr.length;

		for(int i = 0; i < len - 1; i++)
		{
			for(int j = 0; j < len - 1 - i; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Here is your final array:");
		for(int x = 0; x < len; x++)
		{
			System.out.print(arr[x] + "\t");
		}
	}
}
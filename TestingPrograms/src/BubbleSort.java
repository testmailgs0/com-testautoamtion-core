import java.util.Arrays;

public class BubbleSort {
public static void Sort(int[] values)
{
	for(int i=0; i<values.length; i++)
	{
		for(int j=i+1;j<values.length;j++)
		{
			if(values[i]>values[j])
			{
				int temp = values[i];
				values[i]=values[j];
				values[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(values));
}
}

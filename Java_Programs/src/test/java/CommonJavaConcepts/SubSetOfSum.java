
public class SubSetOfSum {

	public static void PrintSubSet(int[] numbers, int sum)
	{
		for(int i =0; i<numbers.length; i++){
	        sum(numbers, i, numbers[i], sum, String.valueOf(numbers[i])); 
	    }
	}
	private static void sum(int[] arr, int i, int sum, int target, String s)
	{   
	    for(int j = i+1; j<arr.length; j++){
	        if(sum+arr[j] == target){
	            System.out.println(s+" "+String.valueOf(arr[j]));
	        }else{
	            sum(arr, j, sum+arr[j], target, s+" "+String.valueOf(arr[j]));
	        }
	    }
	}
}

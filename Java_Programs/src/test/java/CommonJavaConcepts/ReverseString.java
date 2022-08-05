
public class ReverseString {
	/**
     * Java method to reverse String using recursion
     * @param input
     * @return reversed String of input
     */
    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
       
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
         
        }while(number > 0);
     
        return reverse;
    }
}

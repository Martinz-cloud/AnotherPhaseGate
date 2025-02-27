import java.util.Arrays;
public class HighestNumbers{
	public static void main(String...args){

int[] nums = {1,4,5,6,9,7,10,9};
System.out.print(Arrays.toString(highestnums(nums)));
}

	
public static int[] highestnums(int[] nums){
	int highest = 0;
	int highest1 = 0;

	for (int count : nums){
	
 	if (count > highest){
	highest1 = highest;
	highest = count;

	}
 }int[] output = {highest, highest1};
return output;
}

}


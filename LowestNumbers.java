import java.util.Arrays;
public class LowestNumbers{
	public static void main(String...args){

int[] nums = {1,4,5,6,9,7,10,9};
System.out.print(Arrays.toString(lowestnums(nums)));
}

	
public static int[] lowestnums(int[] nums){
	int lowest = 0;
	int lowest1 = 0;
	int fig = nums.length()-1; 
	for (int count : nums){
	
 	if (lowest > count){
	lowest1 = lowest;
	lowest = count;

	}
 }int[] output = {lowest, lowest1};
return output;
}

}

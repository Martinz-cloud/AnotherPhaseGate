public class GreatestCommonDivisor {

	public static void main(String...args){
int output = 0;
int num1 = 6;
int num2 = 3;
for (int count = 1; count <= num1 && count <= num2; count++){
   if (num1 % count == 0 && num2 % count == 0)
         output = count;
}
System.out.print("Greatest common Divisor is: " +output);
	}



}
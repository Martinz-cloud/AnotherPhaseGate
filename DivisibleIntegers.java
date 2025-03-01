import java.util.Scanner;
public class DivisibleIntegers{

public static void main	(String...args){
Scanner input = new Scanner(System.in);

int total = 0;
int number = 0;
for (int count = 1; count <= 30; count++){
	if (count % 3 == 0){
	number++;
}

total += number;

} 

System.out.print("The sum of numbers divisible by three is:" +total);



	}





}
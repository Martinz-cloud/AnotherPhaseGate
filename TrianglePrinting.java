public class TrianglePrinting{
public static void main(String[] args){

int pattern = 10; 

for (int counter = 1; counter <= pattern; counter++){
//pattern1
for (int count = 1; count <= counter; count++){
System.out.print('*');
}
System.out.print("  ");

//pattern2
for(int count = pattern; count >= counter; count--){
System.out.print('*');
}
System.out.print("  ");


//pattern3
for (int count = 1; count < pattern; count++){
System.out.print(' ');
}
for (int count = counter; count <= pattern; count++){
System.out.print('*');
}
System.out.print("  ");

//pattern4
for(int count = counter; count < pattern; count++ ){
System.out.print("  ");
}
for (int count = 1; count <= counter; count++){
System.out.print("*");
}

System.out.println();
	}

   }


}
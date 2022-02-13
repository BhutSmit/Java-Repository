public class typecasting{

	public static void main(String[] args){

		int  typecasting1 = 128;

		byte typecasting2 = (byte)typecasting1; 

		System.out.println(typecasting2);
	}
}

	
	// ✔ In This Typecasingc(Narrowing TyppeCasting). 

	// ✔ Here We Convert Integer ----->  Byte.

	// ✔ So This Type Casting Is Perform Manually.

	// ✔ The Range Of Byte Is -128 To  127.

	// ✔ So When We Add A Number Out Of A Range Here A Clycle Of A Number Is Start.

	// ✔ (-128  -127  -126  -125  -124  -123  -122  -121 -120 .............  127)  128  129  130  131  132  133 134..

	// ✔  When We Add A Number Like 129  So Process Is As Per Below : 

	//  	129 Is is greter than its range so here a cycle is start and print -127

import java.util.Scanner;

public class Sum_Of_Fibonaki{

	public static void main(String[] args){

		int a = 0 , b = 1 , user_input , fibbo = 0 , i , sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Fibonaki Series Step = ");
		user_input = sc.nextInt();

		System.out.println(a);
		System.out.println(b);														

		for (i = 0; i<user_input-2; i++ ) {

			fibbo = a + b;
			a = b;
			b = fibbo;
			sum+=fibbo;
			
			System.out.println(b);
		}

		System.out.print("The Sum OF The Fibonaki Series Is : ");
		System.out.println(sum + 1);


	}
}


/*


Fibonaki Series Is Reprent Like This...

 0 1 1 2 3 5 8 ....... 


 So Here As Per Program a = 0 And b = 1 ;

 👉  In a Fibbonaki Series a Next Number Is Come With Addition Of Two Number Which Stand Before New NUmber

 👉  in a fibbo series first two step are fixed so we print this step as it is

 👉   a = 0  b = 1

 	   In For Loop....

 	   fibbo = a + b    =  0 + 1 = 1 

 	   a = b     		=  1

 	   b = fibbo		=  1

 	   print(b)


 	 ---> Execute Loop Second Time.
 	 

	     fibbo = a + b    =  1 + 1  = 2

 		 a = b     		  =  1 

 	     b = fibbo		  =  2

 	  	 print(b)


✔  With The Help Of This Progrm We Can Print Fibonaki Series Very Easily.  

	
👉  we delcare a variable sum = 0;

	in a  variable sum we store a value of fibonaki and at the end of loop we print sum. 		

*/
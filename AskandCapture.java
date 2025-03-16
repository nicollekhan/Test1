package homework;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AskandCapture {

	public static void main(String[] args) {

		Scanner answer1 = new Scanner(System.in); //creating an object for Scanner Class
		System.out.println("What is your first name?");
		String fname = answer1.next();
		System.out.println("My first name is " + fname +".");
		System.out.printf("My first name is %s.%n",fname);



		Scanner answer2 = new Scanner(System.in); //creating an object for Scanner Class
		System.out.println("What is your whole name?");
		String name = answer2.nextLine(); //variable
		System.out.printf("My whole name is %s.%n", name);




		System.out.println("What is your age?");  //Print out a hard code "String"
		int age;									  //establish return is an int and variable for new scanner object

		boolean validAge = false;					  //boolean -initializing boolean variable (t/f)
		while (!validAge) {						 
			try { 									   //try block, code that might throw an exception
				age= answer2.nextInt();			      //initializing age as the variable for the scanner object, taking the next integer
				validAge = true;					   // validPoop (true) is int and no exceptions thrown, loop will exit
				System.out.println("I am " + age + " years old.");	//will print hard code and object variable
			}

			catch (InputMismatchException e) {	
				System.out.println("Invalid input. Please enter an interger."); 
				System.out.println("What is your age?");
				answer2.next();								 //consumes the invalid input to prevent infinite loop. 
			}
		}


		Scanner answer3=new Scanner(System.in);
		while(true) {
			System.out.println("What is your gender? (Male/Female)");
			String gender=answer3.nextLine();

			if (gender.equalsIgnoreCase("Male")) {
				System.out.println("I am a male.");break;
			}else if (gender.equalsIgnoreCase("Female")) {
				System.out.println("I am a female.");break;
			} else {System.out.println("Invalid input. Please enter 'Male' or 'Female'.");

			}
		}


		System.out.println("Where are you from?");
		String hometown = answer3.nextLine();
		System.out.println("I am from " + hometown +".");

		System.out.println("Where do you live now?");
		String location = answer3.nextLine();
		System.out.println("I currently live in " + location+".");

		System.out.println("Where do you work?");
		String job = answer3.next();
		System.out.println("I work at " + job +".");

		Scanner answer4=new Scanner(System.in);
		System.out.println("What is your job role?");
		String role = answer4.nextLine();
		System.out.println("My role is " + role +".");
		System.out.println("I work at " + job + " as a(n) " + role +".");
		System.out.printf("I work at %s as a(n) %s.%n",job,role);
		

		System.out.println("What is your salary?");
		double salary;
		boolean validSalary=false;
		while (!validSalary) {
			try {
				salary=answer4.nextDouble();
				validSalary=true;
				System.out.printf("My salary will be $%.2f.%n",salary);
			}
			catch (InputMismatchException f) {
				System.out.printf("Please enter salary in numerical form.%nWhat is your salary?%n");
				answer4.next();
			}
			
		}

		Scanner userbonus=new Scanner(System.in);
		System.out.println("How much raise are you getting next year?");
		double bonus;
		boolean validBonus=false;
		while (!validBonus) {
			try {
				bonus=userbonus.nextDouble();
				validBonus=true;
				System.out.printf("My raise will be $%.2f.",bonus);
			}
			catch(InputMismatchException g) {
				System.out.printf("Please enter bonus in numerical form.%nHow much raise are you getting next year%n");
				userbonus.next();
			}
			//userbonus.close();
		}
	
		
		System.out.println("YOU MADE IT SO FAR!");
	}}

//	double sum =  salary +  bonus;
//	System.out.println("this:"+sum);

//	String formattedSum = String.format("$%.2f", sum); // Format with $ and 2 decimal places
//	System.out.println("Your total salary next year will be: " + formattedSum);

//				double sum =  salary +  bonus;
//				String newsum=String.format("$%.2f",sum);
//		String newbonus=String.format("$%.2f", bonus);
//
//		System.out.printf("I will get %s as an annual raise, so my total salary would be %s next year.%n", newbonus, formattedSum);
//		answerx.close();

//System.out.println("I make String.format("% .2f", salary)  dollars. 
//I will get String.format("% .2f", bonus) as an annual raise so my total salary would be $String.format("% .2f", sum) next year." );

//Ask and Capture answer to the following questions:
//		:)	What is your name?
//		:)	How old are you?
//			What is your gender? --
//		:)	Where are you from?
//		:)	Where do you live now?
//		:)	Where do you work?
//		:)	What is your job role?  I work at IBM as Automation Engineer.
//		:)	What is your salary?
//		:)	How much raise are you getting next year?	
//			 I make 100000.00 dollar. I will get 50000.00 
//		     as annual raise so my total salary would be 150000.00 dollar next year.

//My name is James Bond. I am 40 years old, male. I work at IBM as Automation Engineer. 
//I currently live in New York. I am originally from England. 
//I make 100000.00 dollar. I will get 50000.00 as annual raise so my total 
//salary would be 150000.00 dollar next year.



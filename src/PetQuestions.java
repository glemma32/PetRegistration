
//public class PetQuestions {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;
		  
		 public class PetQuestions
		 {
		     public static void main( String[] args )
		    {
		        String name;
		        String breed;
		        int age;

		        System.out.print( "Greetings. What is your pet's name? " );
		        //name = keyboard.next();
		        Scanner scannerInput = new Scanner(System.in);
				name =  scannerInput.next();
		 
		        System.out.print( "What kind of animal is " + name + "? " );
		        Scanner breedInput = new Scanner(System.in);
				breed =  breedInput.next();
		        
		        System.out.print( "How old is " + name + "? ");
		        
		        Scanner ageInput = new Scanner(System.in);
				age =  ageInput.nextInt();
		        
		        System.out.println( name + " is" + breed + " and it is " + age );
		     }


}

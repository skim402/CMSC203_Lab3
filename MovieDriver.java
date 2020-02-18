import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//userInput object to scan from user
		Scanner userInput = new Scanner(System.in);
		
		//movie object
		Movie m = new Movie();
		
		//ans variable to store user's answer
		String ans = "y";
		
		//do-while loop: scan movies as many as user want
		//scan movie title, rating, and the number of tickets sold
		do {
			System.out.println("Enter the title of a movie: ");
			m.setTitle(userInput.nextLine());
			
			System.out.println("Enter the movie's rating: ");
			m.setRating(userInput.nextLine());
			
			System.out.println("Enter the number of tickets sold at a theater: ");
			m.setSoldTickets(userInput.nextInt());
			
			System.out.println(m);
			
			userInput.nextLine();
			System.out.println("Do you want to enter another movie? (y or n)");
			ans = userInput.nextLine();

		}while(ans.equals("y"));
		
		//close message
		System.out.println("Goodbye");
		userInput.close();
	}

}

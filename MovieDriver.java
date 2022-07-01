import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args)
	{
		String x;
		do{
		Scanner input = new Scanner(System.in);//Creates scanner object
		Scanner end = new Scanner(System.in);
		Movie myMovie = new Movie();//new movie object
		System.out.println("Please enter the title of your movie:");//promts userto type movie title
		myMovie.setTitle(input.nextLine());//sets user input to title
		System.out.println("What is the rating for "+ myMovie.getTitle());//prompts user for review
		myMovie.setRating(input.nextLine());//sets rating
		System.out.println("Enter the number of tickets sold for this movie");//asks for ticket sales
		myMovie.setSoldTickets(input.nextInt());// sets ticket sales
		System.out.println(myMovie.toString());// prints toString method
		System.out.println("Do you want to enter another? (y or n)");
		x= end.nextLine();
		}while( x.equals("y"));
		System.out.println("Goodbye");
		

	}
}